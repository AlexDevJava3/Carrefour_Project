package com.carrefour.carrefour_kata.service;

import com.carrefour.carrefour_kata.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrderHistory(String customerId);
}