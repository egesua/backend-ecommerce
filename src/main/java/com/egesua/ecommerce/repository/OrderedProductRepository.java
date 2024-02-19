package com.egesua.ecommerce.repository;

import com.egesua.ecommerce.entity.OrderedProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedProductRepository extends JpaRepository<OrderedProduct,Long> {
}