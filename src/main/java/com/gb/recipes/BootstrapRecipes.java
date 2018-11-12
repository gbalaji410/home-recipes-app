package com.gb.recipes;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

import com.gb.recipes.ProtoBufTraining.Person;
import com.gb.recipes.ProtoBufTraining.Person.PhoneNumber;
import com.gb.recipes.RecipeInformation.Recipe;
import com.gb.recipes.RecipeInformation.Recipe.Cuisine;
import com.gb.recipes.RecipeInformation.Recipe.Ingredient;
import com.gb.recipes.RecipeInformation.Recipe.IngredientMeasure;
import com.gb.recipes.repository.RecipeRepository;

@SpringBootApplication
public class BootstrapRecipes {
    public static void main(String[] args) {
        SpringApplication.run(BootstrapRecipes.class, args);
    }
    
    @Autowired
    private RecipeRepository recipeRepository;

    @Bean
    ProtobufHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtobufHttpMessageConverter();
    }
    
    @Bean
    public ProtoBufRecipeRepository protoBufRecipeRepository(){
    	Map<Integer, Recipe> recipes = new HashMap<>();
    	
    	Ingredient i1 = Ingredient.newBuilder().setName("Jaggery")
    			.setQuantity(100).setMeasure(IngredientMeasure.GRAMS).build();
    	
    	
        Recipe r1 = Recipe.newBuilder()
          .setId(1)
          .setName("Sample Recipe 001")
          .setPrepTime(10)
          .setCookTime(30)
          .setCuisine(Cuisine.SOUTH_INDIAN)
          .setRating(4)
          .addIngredients(i1)
          .build();
        
        recipes.put(r1.getId(), r1);
        return new ProtoBufRecipeRepository(recipes);
    }
}