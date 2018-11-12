package com.gb.recipes.entity;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;

@Document(collection = "recipes")
@lombok.Getter
@lombok.Setter
@lombok.EqualsAndHashCode
@lombok.ToString
@lombok.NoArgsConstructor
public class Recipe {
	
	@Id
	private String id;
	private int recipeId;
	private String name;
	private int prepTime;
	private int cookTime;
	private int rating;
	private Cuisine cuisine;
	private List<Ingredient> ingredients;
}
