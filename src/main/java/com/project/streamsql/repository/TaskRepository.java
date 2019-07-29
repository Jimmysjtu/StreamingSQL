package com.project.streamsql.repository;

import com.project.streamsql.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional(readOnly = false)
public class TaskRepository extends SimpleJpaRepository<Task, Long> {

    @Autowired
    public TaskRepository(EntityManager em) {
        super(Task.class, em);
    }


}
