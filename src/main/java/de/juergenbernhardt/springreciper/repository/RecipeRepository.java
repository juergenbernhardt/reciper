package de.juergenbernhardt.springreciper.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<RecipeEntity, RecipeIngredientId> {

}
