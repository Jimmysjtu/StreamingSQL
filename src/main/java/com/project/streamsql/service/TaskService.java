package com.project.streamsql.service;

import com.project.streamsql.entity.Task;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class TaskService {
    @PersistenceContext
    private EntityManager entityManager;

    /**
     * 添加客户
     *
     * @param task
     */
    @Transactional
    public void addTask(Task task) {

        entityManager.persist(task);

    }

    public Task getTaskById(Long id) {
        return entityManager.find(Task.class, id);
    }

    @Transactional
    public void updateTaskById(Task task) {
        entityManager.merge(task);
    }

    @Transactional
    public void deleteTaskById(Long id) {
        Task task = entityManager.find(Task.class,id);
        entityManager.remove(task);
    }


}
