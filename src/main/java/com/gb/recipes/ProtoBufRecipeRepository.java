package com.gb.recipes;

import java.util.Map;

import com.gb.recipes.RecipeInformation.Recipe;

public class ProtoBufRecipeRepository {

	Map<Integer, Recipe> recipes;

	public ProtoBufRecipeRepository(Map<Integer, Recipe> recipes) {
		this.recipes = recipes;
	}

	public Recipe getRecipe(int id) {
		return recipes.get(id);
	}
}
