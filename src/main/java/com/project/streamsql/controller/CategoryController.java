package com.project.streamsql.controller;

import com.project.streamsql.entity.Category;
import com.project.streamsql.repository.CategoryRepository;
import com.project.streamsql.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping("categorys")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping("all")
    public List<Category> loadCustomers() {
        return categoryRepository.findAll();
    }

    @RequestMapping("get/{id}")
    public Category getCategory(@PathVariable("id") Long id) {
        return categoryRepository.findById(id).get();
    }

    /**
     * @param category
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @Transactional
    public Category addCategory(@RequestBody Category category) {

        categoryService.addCategory(category);

        Long id = category.getId();

        return categoryService.getCategoryById(id);

    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
//    @Transactional
    public Category updateCategory(@RequestBody Category category) {

        categoryService.updateCategoryById(category);

        Long id = category.getId();

        return categoryService.getCategoryById(id);

    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
//    @Transactional
    public Category deleteCategory(@RequestBody Category category) {

        Long id = category.getId();
        category = getCategory(id);
        categoryService.deleteCategoryById(id);
        return category;

    }

}

