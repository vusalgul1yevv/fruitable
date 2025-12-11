package com.example.fruitables.services.impl;

import com.example.fruitables.repositories.ProductRepository;
import com.example.fruitables.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
}
