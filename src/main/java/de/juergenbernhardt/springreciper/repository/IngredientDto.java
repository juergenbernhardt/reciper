package de.juergenbernhardt.springreciper.repository;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class IngredientDto implements Serializable {

    private Integer id;

    private String name;

}
