package com.mr486.pizzahut.ingredient;

import com.mr486.pizzahut.Dessert;
import com.mr486.pizzahut.Ingredient;

public class Sucre extends Ingredient
{

	public Sucre(Dessert d) {dessert = d;}

	@Override
	public double getPrixIngredient() { return 0.10;}

	@Override
	public String getNameIngredient() { return "sucre";	}

}
