package com.gb.recipes.entity;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;

@Document(collection = "mycollection")
@lombok.Getter
@lombok.Setter
@lombok.EqualsAndHashCode
@lombok.ToString
@lombok.NoArgsConstructor
public class Ingredient {
	
	private int id;
	private String name;
	private int quantity;
	private Measure measure;
}
