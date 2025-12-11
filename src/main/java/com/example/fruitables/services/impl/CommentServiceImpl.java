package com.example.fruitables.services.impl;

import com.example.fruitables.repositories.CommentRepository;
import com.example.fruitables.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;
}
