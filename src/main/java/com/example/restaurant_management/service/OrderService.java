package com.example.restaurant_management.service;

import com.example.restaurant_management.model.Order;
import com.example.restaurant_management.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;

    public void addOrder(Order order) {
        orderRepo.save(order);
    }
}
