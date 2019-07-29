package com.project.streamsql.service;

import com.project.streamsql.entity.Job;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class JobService {

    @PersistenceContext
    private EntityManager entityManager;
    /**
     * 添加任务
     *
     * @param job
     */
    @Transactional
    public void addJob(Job job) {
        entityManager.persist(job);
    }
    @Transactional
    public Job getJobById(String id) {
        return entityManager.find(Job.class, id);
    }

    @Transactional
    public void updateJobById(Job job) {
        entityManager.merge(job);
    }

    @Transactional
    public void deleteJobById(String id) {
        Job job = entityManager.find(Job.class,id);
        entityManager.remove(job);
    }

}
