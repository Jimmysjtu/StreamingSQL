package com.project.streamsql.service;

import com.project.streamsql.entity.User;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;
    /**
     * 添加任务
     *
     * @param user
     */
    @Transactional
    public void addUser(User user) {
        entityManager.persist(user);
    }
    @Transactional
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    public void updateUserById(User user) {
        entityManager.merge(user);
    }

    @Transactional
    public void deleteUserById(Long id) {
        User user = entityManager.find(User.class,id);
        entityManager.remove(user);
    }
}
