package com.project.streamsql.repository;


import com.project.streamsql.entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional(readOnly = false)
public class JobRepository extends SimpleJpaRepository<Job, Long> {
    @Autowired
    public JobRepository(EntityManager em) {
        super(Job.class, em);
    }
}
