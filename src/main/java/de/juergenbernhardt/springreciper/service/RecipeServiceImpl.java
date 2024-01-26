package de.juergenbernhardt.springreciper.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.juergenbernhardt.springreciper.repository.RecipeDto;
import de.juergenbernhardt.springreciper.repository.RecipeEntity;
import de.juergenbernhardt.springreciper.repository.RecipeRepository;
import de.juergenbernhardt.springreciper.util.DtoMapperUtil;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public List<RecipeDto> getAllRecipes() {
        List<RecipeEntity> list = StreamSupport.stream(recipeRepository.findAll().spliterator(), false).toList();
        return list.stream().map(DtoMapperUtil::mapTo).collect(Collectors.toList());
    }

    @Override
    public List<RecipeEntity> getAllRecipeEntities() {
        return (List<RecipeEntity>) recipeRepository.findAll();
    }

}
