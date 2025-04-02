package com.carrefour.carrefour_kata.service;

import com.carrefour.carrefour_kata.model.Order;
import com.carrefour.carrefour_kata.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getOrderHistory(String customerId) {
        return orderRepository.findByCustomerId(customerId);
    }
}