package com.cordona.recipeproject.services;

import com.cordona.recipeproject.domain.Recipe;
import com.cordona.recipeproject.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @Override
    public Set<Recipe> getAll() {
        Set<Recipe> recipes = new HashSet<>();
        this.recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return  recipes;
    }
}
