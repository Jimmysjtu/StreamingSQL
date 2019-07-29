package com.project.streamsql.service;

import com.project.streamsql.entity.Category;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class CategoryService {

    @PersistenceContext
    private EntityManager entityManager;
    /**
     * 添加任务
     *
     * @param category
     */
    @Transactional
    public void addCategory(Category category) {
        entityManager.persist(category);
    }
    @Transactional
    public Category getCategoryById(Long id) {
        return entityManager.find(Category.class, id);
    }

    @Transactional
    public void updateCategoryById(Category category) {
        entityManager.merge(category);
    }

    @Transactional
    public void deleteCategoryById(Long id) {
        Category category = entityManager.find(Category.class,id);
        entityManager.remove(category);
    }

}
