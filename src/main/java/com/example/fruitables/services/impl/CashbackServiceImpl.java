package com.example.fruitables.services.impl;

import com.example.fruitables.repositories.CashbackRepository;
import com.example.fruitables.services.CashbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CashbackServiceImpl implements CashbackService {
    private final CashbackRepository cashbackRepository;
}
