package de.ait.shop42.security.sec_services;


import de.ait.shop42.security.accounting.user.dto.UserLoginDto;
import de.ait.shop42.security.accounting.user.entity.User;
import de.ait.shop42.security.accounting.user.service.UserService;
import de.ait.shop42.security.sec_dto.TokenResponseDto;
import io.jsonwebtoken.Claims;
import jakarta.security.auth.message.AuthException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserDetailsService userService;
    private final TokenService tokenService;
    private  final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final Map<String, String> refreshTokensStorage = new HashMap<>(); //username, token


    public TokenResponseDto login(UserLoginDto inboundUser) throws AuthException {

        String username = inboundUser.getName();
        User foundUser = (User)userService.loadUserByUsername(username);

        if (bCryptPasswordEncoder.matches(inboundUser.getPassword(), foundUser.getPassword())) {

            String accessToken = tokenService.generateAccessToken(foundUser);
            String refreshToken = tokenService.generateRefreshToken(foundUser);

            refreshTokensStorage.put(accessToken, refreshToken);

            return new TokenResponseDto(accessToken, refreshToken);

        } else {
            throw  new AuthException("Invalid Password");
        }
    }

    public TokenResponseDto getNewAccessToken(String inboundRefreshToken){
        Claims refreshClaims = tokenService.getRefreshClaims(inboundRefreshToken);
        String username = refreshClaims.getSubject();

        String saveRefreshToken = refreshTokensStorage.get(username);

        if (saveRefreshToken != null && saveRefreshToken.equals(inboundRefreshToken)) {
            User foundUser = (User)userService.loadUserByUsername(username);
            String accessToken = tokenService.generateAccessToken(foundUser);
            return new TokenResponseDto(accessToken, inboundRefreshToken);
        } else {
            return new TokenResponseDto(null, null);
        }
    }
}
