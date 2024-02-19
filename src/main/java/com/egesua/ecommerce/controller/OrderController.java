package com.egesua.ecommerce.controller;

import com.egesua.ecommerce.converter.Converter;
import com.egesua.ecommerce.dto.response.OrderResponse;
import com.egesua.ecommerce.entity.Order;
import com.egesua.ecommerce.entity.Products;
import com.egesua.ecommerce.service.OrderService;
import com.egesua.ecommerce.service.OrderedProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private OrderService orderService;
    private OrderedProductService orderedProductService;

    @Autowired
    public OrderController(OrderService orderService, OrderedProductService orderedProductService) {
        this.orderService = orderService;
        this.orderedProductService = orderedProductService;
    }

    @PostMapping("/")
    public OrderResponse saveOrder(@RequestBody Order order) {
        List<Products> productsList = order.getProducts();

        for (Products product : productsList) {
            order.addProduct(product);
        }

        return orderService.saveOrder(order);
    }


}