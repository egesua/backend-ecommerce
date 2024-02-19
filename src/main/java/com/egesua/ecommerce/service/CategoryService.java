package com.egesua.ecommerce.service;

import com.egesua.ecommerce.dto.response.CategoryResponse;
import com.egesua.ecommerce.entity.Category;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> getAllCategories();
    Category getCategoryByID(long id);
    CategoryResponse save(Category category);


}
