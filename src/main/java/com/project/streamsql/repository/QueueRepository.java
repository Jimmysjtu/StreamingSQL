package com.project.streamsql.repository;

import com.project.streamsql.entity.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional(readOnly = false)
public class QueueRepository extends SimpleJpaRepository<Queue, Long> {

    @Autowired
    public QueueRepository(EntityManager em) {
        super(Queue.class, em);
    }
}
