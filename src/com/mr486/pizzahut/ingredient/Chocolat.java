package com.mr486.pizzahut.ingredient;

import com.mr486.pizzahut.Dessert;
import com.mr486.pizzahut.Ingredient;

public class Chocolat extends Ingredient
{

	public Chocolat(Dessert d) {dessert = d;}

	@Override
	public double getPrixIngredient() { return 0.30;}

	@Override
	public String getNameIngredient() { return "Nutella";	}

}
