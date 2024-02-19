package com.egesua.ecommerce.service;

import com.egesua.ecommerce.dto.response.OrderResponse;
import com.egesua.ecommerce.dto.response.ProductsResponseForOrder;
import com.egesua.ecommerce.entity.Order;

public interface OrderService {
    OrderResponse saveOrder(Order order);

}
