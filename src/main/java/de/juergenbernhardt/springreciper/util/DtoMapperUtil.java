package de.juergenbernhardt.springreciper.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import de.juergenbernhardt.springreciper.repository.IngredientDto;
import de.juergenbernhardt.springreciper.repository.IngredientEntity;
import de.juergenbernhardt.springreciper.repository.RecipeDto;
import de.juergenbernhardt.springreciper.repository.RecipeEntity;
import de.juergenbernhardt.springreciper.repository.RecipeIngredientEntity;

public class DtoMapperUtil {

    private DtoMapperUtil() {

    }

    public static RecipeDto mapTo(final RecipeEntity recipeEntity) {
        RecipeDto dto = new RecipeDto();
        dto.setId(recipeEntity.getId());
        dto.setName(recipeEntity.getName());
        List<RecipeIngredientEntity> list = StreamSupport
                .stream(recipeEntity.getRecipeIngredients().spliterator(), false).toList();
        List<IngredientEntity> ingredients = list.stream().map(i -> i.getIngredient()).collect(Collectors.toList());
        List<IngredientDto> collects = ingredients.stream().map(DtoMapperUtil::mapTo).collect(Collectors.toList());
        dto.setIntegredientDtos(collects);
        return dto;
    }

    public static IngredientDto mapTo(final IngredientEntity ingredientEntity) {
        IngredientDto dto = new IngredientDto();
        dto.setId(ingredientEntity.getId());
        dto.setName(ingredientEntity.getName());
        return dto;
    }

}
