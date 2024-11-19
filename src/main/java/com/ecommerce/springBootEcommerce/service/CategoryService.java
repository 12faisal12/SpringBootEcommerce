package com.ecommerce.springBootEcommerce.service;

import com.ecommerce.springBootEcommerce.model.Category;
import com.ecommerce.springBootEcommerce.payload.CategoryDto;
import com.ecommerce.springBootEcommerce.payload.CategoryResponse;

import java.util.List;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto deleteCategory(Long categoryId);
    CategoryDto updateCategory(CategoryDto categoryDto, Long categoryId);
}
