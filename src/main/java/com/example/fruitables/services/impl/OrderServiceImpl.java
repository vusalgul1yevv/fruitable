package com.example.fruitables.services.impl;

import com.example.fruitables.repositories.OrderRepository;
import com.example.fruitables.services.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderItemService {
    private final OrderRepository orderRepository;
}
