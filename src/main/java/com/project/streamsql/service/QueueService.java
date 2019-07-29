package com.project.streamsql.service;

import com.project.streamsql.entity.Queue;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class QueueService {
    @PersistenceContext
    private EntityManager entityManager;
    /**
     * 添加任务
     *
     * @param queue
     */
    @Transactional
    public void addQueue(Queue queue) {
        entityManager.persist(queue);
    }
    @Transactional
    public Queue getQueueById(Long id) {
        return entityManager.find(Queue.class, id);
    }

    @Transactional
    public void updateQueueById(Queue queue) {
        entityManager.merge(queue);
    }

    @Transactional
    public void deleteQueueById(Long id) {
        Queue queue = entityManager.find(Queue.class,id);
        entityManager.remove(queue);
    }
}
