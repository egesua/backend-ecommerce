package com.egesua.ecommerce.service;

import com.egesua.ecommerce.entity.OrderedProduct;

import java.util.List;

public interface OrderedProductService {
    OrderedProduct saveOrderedProduct(OrderedProduct orderedProduct);
    List<OrderedProduct> getAllProducts();
}