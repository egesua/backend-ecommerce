package com.egesua.ecommerce.controller;

import com.egesua.ecommerce.dto.response.CategoryResponse;
import com.egesua.ecommerce.entity.Category;
import com.egesua.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping("/")
    public List<CategoryResponse> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/")
    public CategoryResponse save(@RequestBody Category category) {
        return categoryService.save(category);
    }

}