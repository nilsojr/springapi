package com.islandsoftware.springapi.services;

import com.islandsoftware.springapi.entities.Order;
import com.islandsoftware.springapi.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id)
    {
        var order = orderRepository.findById(id);
        return order.get();
    }
}
