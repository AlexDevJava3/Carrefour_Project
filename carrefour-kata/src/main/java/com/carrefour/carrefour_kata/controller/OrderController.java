package com.carrefour.carrefour_kata.controller;

import com.carrefour.carrefour_kata.model.Order;
import com.carrefour.carrefour_kata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{customerId}")
    public List<Order> getOrderHistory(@PathVariable String customerId) {
        return orderService.getOrderHistory(customerId);
    }
}