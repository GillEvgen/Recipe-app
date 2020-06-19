package com.springframework.Recipeapp.repositories;

import com.springframework.Recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository  extends CrudRepository<Category, Long> {
}
