package com.project.streamsql.repository;

import com.project.streamsql.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional(readOnly = false)
public class UserRepository extends SimpleJpaRepository<User, Long> {
    @Autowired
    public UserRepository(EntityManager em) {
        super(User.class, em);
    }
}
