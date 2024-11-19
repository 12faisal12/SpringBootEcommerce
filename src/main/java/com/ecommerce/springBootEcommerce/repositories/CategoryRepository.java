package com.ecommerce.springBootEcommerce.repositories;

import com.ecommerce.springBootEcommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(String categoryName);
}
