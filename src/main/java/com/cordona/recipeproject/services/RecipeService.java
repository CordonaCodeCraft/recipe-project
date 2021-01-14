package com.cordona.recipeproject.services;

import com.cordona.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
