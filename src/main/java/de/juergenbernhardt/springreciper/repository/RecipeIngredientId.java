package de.juergenbernhardt.springreciper.repository;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@Setter
@Getter
public class RecipeIngredientId implements Serializable {

    @Column(name = "REC_ID")
    private int recId;

    @Column(name = "ING_ID")
    private int ingId;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        RecipeIngredientId that = (RecipeIngredientId) obj;
        return recId == that.recId &&
                ingId == that.ingId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(recId, ingId);
    }

}
