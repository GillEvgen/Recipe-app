package com.springframework.Recipeapp.repositories;

import com.springframework.Recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository  extends CrudRepository<Recipe, Long> {
}
