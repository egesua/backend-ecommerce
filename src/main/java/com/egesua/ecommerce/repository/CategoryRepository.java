package com.egesua.ecommerce.repository;

import com.egesua.ecommerce.entity.Category;
import com.egesua.ecommerce.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query(value = "SELECT * FROM ecommerceweb.categories AS c WHERE c.category_id = :categoryID",nativeQuery = true)
    Category getCategoryByID(long categoryID);
}
