package com.ecommerce.dimensao.controller;

import com.ecommerce.dimensao.controller.dto.OrderDTO;
import com.ecommerce.dimensao.repository.OrderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping()
    public List<OrderDTO> findAll() {
        var orders = orderRepository.findAll();
        return orders
                .stream()
                .map(OrderDTO::converter)
                .collect(Collectors.toList());
    }

}
