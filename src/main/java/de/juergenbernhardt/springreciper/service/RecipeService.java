package de.juergenbernhardt.springreciper.service;

import java.util.List;

import de.juergenbernhardt.springreciper.repository.RecipeDto;
import de.juergenbernhardt.springreciper.repository.RecipeEntity;

public interface RecipeService {

    List<RecipeDto> getAllRecipes();

    List<RecipeEntity> getAllRecipeEntities();

}