package com.cordona.recipeproject.services;

import com.cordona.recipeproject.command.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
