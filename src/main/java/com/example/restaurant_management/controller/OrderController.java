package com.example.restaurant_management.controller;

import com.example.restaurant_management.model.Order;
import com.example.restaurant_management.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("orderr")
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);
    }

}
