package com.example.fruitables.services.impl;

import com.example.fruitables.repositories.CartRepository;
import com.example.fruitables.services.CartItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartItemService {
    private final CartRepository cartRepository;
}
