package com.example.fruitables.services.impl;

import com.example.fruitables.repositories.CartItemRepository;
import com.example.fruitables.services.CartItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartItemServiceImpl implements CartItemService {
    private final CartItemRepository cartItemRepository;
}
