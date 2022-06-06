package com.tacos.data;

import org.springframework.data.repository.CrudRepository;


import com.tacos.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

	
}
