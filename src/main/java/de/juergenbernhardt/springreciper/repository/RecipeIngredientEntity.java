package de.juergenbernhardt.springreciper.repository;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "RECIPE_INGREDIENT")
@NoArgsConstructor
@Setter
@Getter
public class RecipeIngredientEntity {

    @EmbeddedId
    // @AttributeOverrides({
    // @AttributeOverride(name = "recId", column = @Column(name = "REC_ID")),
    // @AttributeOverride(name = "ingId", column = @Column(name = "ING_ID"))
    // })
    private RecipeIngredientId id;

    @ManyToOne
    @JoinColumn(name = "REC_ID", insertable = false, updatable = false)
    private RecipeEntity recipe;

    @ManyToOne
    @JoinColumn(name = "ING_ID", insertable = false, updatable = false)
    private IngredientEntity ingredient;

    @Column(name = "RET_DESCRIPTION", length = 255)
    private String retDescription;

}
