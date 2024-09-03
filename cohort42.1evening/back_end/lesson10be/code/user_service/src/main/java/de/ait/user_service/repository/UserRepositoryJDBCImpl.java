package de.ait.user_service.repository;

import de.ait.user_service.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;


import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class UserRepositoryJDBCImpl implements UserRepository{


    private final JdbcTemplate jdbcTemplate;
    private final DataSource dataSource;

    private static final RowMapper<User> USER_ROW_MAPPER = (row,rowNumber)->{
        Long id = row.getLong("id");
        String name = row.getString("name");
        String email = row.getString("email");
        String password = row.getString("password");

        User user = new User(id,name,email,password);
        return user;
    };




    @Override
    public List<User> findAll() {
        String queryStr = "SELECT id,name,email,password  FROM t_user";
        return jdbcTemplate.query(queryStr,USER_ROW_MAPPER);
    }


    @Override
    public User save(User user) {
        if (user.getId()==null) {
            return create(user);
        } else {
            return update(user);
        }
    }

    private User update(User user) {
        String queryStr="UPDATE t_user SET name=?, email=?, password=? WHERE id=?";
        int update = jdbcTemplate.update(
                queryStr,
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getId()
        );
        if(update==0){
            throw new RuntimeException("update fail");
        }
        return user;
    }


    public User create(User user) {

        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource)
                .usingGeneratedKeyColumns("id")
                .withTableName("t_user");
/*
        Map<String,Object> parameters = new HashMap<>();
        parameters.put("name",user.getName());
        parameters.put("email",user.getEmail());
        parameters.put("password",user.getPassword());


 */
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name",user.getName())
                .addValue("email",user.getEmail())
                .addValue("password", user.getPassword());

        long newID = jdbcInsert.executeAndReturnKey(params).longValue();
        user.setId(newID);
        return user;

    }

    @Override
    public User delete(Long id) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }
}
