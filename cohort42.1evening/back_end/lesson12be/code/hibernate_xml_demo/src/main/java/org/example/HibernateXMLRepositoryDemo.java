package org.example.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateXMLRepositoryDemo {
    private final SessionFactory  sessionFactory;

    public HibernateXMLRepositoryDemo() {
       sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

    }



    public List<User> findAll() {
        try(EntityManager entityManager = sessionFactory.createEntityManager()) {
            return entityManager.createQuery("from User", User.class).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("get all users fail");
        }
    }

    public User findById(Long id) {
        try(EntityManager entityManager = sessionFactory.createEntityManager()) {
            return entityManager.find(User.class, id);
        } catch (Exception e) {
            throw new RuntimeException("get by id (" + id + ") user  fail");
        }
    }

    public User create(User user) {
        EntityTransaction transaction = null;
        try(EntityManager entityManager = sessionFactory.createEntityManager()) {
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(user);
            transaction.commit();
            return user;
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("create user (" + user + ") fail" );
        }
    }

}
