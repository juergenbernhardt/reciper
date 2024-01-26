package de.juergenbernhardt.springreciper.repository;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "RECIPE")
@NoArgsConstructor
@Setter
@Getter
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REC_ID")
    private Integer id;

    @Column(name = "REC_NAME")
    private String name;

    @OneToMany(mappedBy = "recipe", fetch = FetchType.EAGER)
    private Set<RecipeIngredientEntity> recipeIngredients;

}
