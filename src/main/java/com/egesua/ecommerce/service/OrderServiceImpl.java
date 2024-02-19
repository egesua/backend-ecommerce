package com.egesua.ecommerce.service;

import com.egesua.ecommerce.converter.Converter;
import com.egesua.ecommerce.dto.response.OrderResponse;
import com.egesua.ecommerce.entity.Order;
import com.egesua.ecommerce.entity.Products;
import com.egesua.ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRespository) {
        this.orderRepository = orderRespository;
    }

    @Override
    public OrderResponse saveOrder(Order order) {
        return Converter.findOrder(orderRepository.save(order));
    }


}
