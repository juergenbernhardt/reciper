package de.juergenbernhardt.springreciper.repository;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "INGREDIENT")
@NoArgsConstructor
@Setter
@Getter
public class IngredientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ING_ID")
    private Integer id;

    @Column(name = "ING_NAME")
    private String name;

    @OneToMany(mappedBy = "ingredient")
    private Set<RecipeIngredientEntity> ingredients;

}
