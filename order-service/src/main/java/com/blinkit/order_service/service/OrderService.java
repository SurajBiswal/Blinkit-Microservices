package com.blinkit.order_service.service;

import com.blinkit.order_service.entity.Orders;
import com.blinkit.order_service.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Orders createOrder(Orders order){

        order.setStatus("CREATED");

        return repository.save(order);
    }

}
