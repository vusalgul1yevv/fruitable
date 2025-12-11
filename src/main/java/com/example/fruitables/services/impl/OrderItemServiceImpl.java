package com.example.fruitables.services.impl;

import com.example.fruitables.repositories.OrderItemRepository;
import com.example.fruitables.services.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {
    private final OrderItemRepository orderItemRepository;
}
