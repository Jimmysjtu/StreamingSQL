package com.project.streamsql.repository;

import com.project.streamsql.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional(readOnly = false)
public class CategoryRepository extends SimpleJpaRepository<Category, Long> {

    @Autowired
    public CategoryRepository(EntityManager em) {
        super(Category.class, em);
    }
}
