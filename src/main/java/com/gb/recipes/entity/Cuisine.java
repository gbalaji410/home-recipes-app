package com.gb.recipes.entity;

public enum Cuisine {
	SOUTH_INDIAN(1), NORTH_INDIAN(2);
	
	private int code;
	
	private Cuisine(int code) {
		this.code = code;
	}
}
