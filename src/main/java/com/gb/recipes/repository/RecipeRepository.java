package com.gb.recipes.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gb.recipes.entity.Recipe;
import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;

@Repository()
public interface RecipeRepository extends DocumentDbRepository<Recipe, String> {
	
    //List<Recipe> findByName(String name); 

}
