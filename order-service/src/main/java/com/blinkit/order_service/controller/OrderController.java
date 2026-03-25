package com.blinkit.order_service.controller;

import com.blinkit.order_service.entity.Orders;
import com.blinkit.order_service.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Orders create(@RequestBody Orders order){
        return service.createOrder(order);
    }

}
