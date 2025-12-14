package com.example.fruitables.services;

import com.example.fruitables.dtos.category.CategoryCreateDto;
import com.example.fruitables.dtos.category.CategoryDto;
import com.example.fruitables.dtos.category.CategoryUpdateDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getDashboardCategories();
    boolean createCategory(CategoryCreateDto categoryCreateDto);
    CategoryUpdateDto getUpdatedCategory(Long id);
    boolean updateCategory(Long id, CategoryUpdateDto categoryUpdateDto);
    boolean removeCategory(Long id);
}
