package de.juergenbernhardt.springreciper.repository;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RecipeDto implements Serializable {

    private Integer id;

    private String name;

    private List<IngredientDto> integredientDtos;

}
