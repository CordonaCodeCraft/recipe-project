package com.cordona.recipeproject.services;

import com.cordona.recipeproject.command.RecipeCommand;
import com.cordona.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    public RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);

}
