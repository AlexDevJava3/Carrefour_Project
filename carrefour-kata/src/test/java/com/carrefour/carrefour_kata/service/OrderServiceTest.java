package com.carrefour.carrefour_kata.service;


import com.carrefour.carrefour_kata.model.Order;
import com.carrefour.carrefour_kata.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

    @InjectMocks
    private OrderServiceImpl orderService;

    @Mock
    private OrderRepository orderRepository;

    @Test
    public void testGetOrderHistory() {
        String customerId = "123";
        List<Order> expectedOrders = new ArrayList<>();
        Order order = new Order();
        order.setId(1L);
        order.setCustomerId(customerId);
        order.setOrderDate(new Date());
        expectedOrders.add(order);

        when(orderRepository.findByCustomerId(customerId)).thenReturn(expectedOrders);

        List<Order> actualOrders = orderService.getOrderHistory(customerId);

        assertEquals(expectedOrders, actualOrders);
    }
}
