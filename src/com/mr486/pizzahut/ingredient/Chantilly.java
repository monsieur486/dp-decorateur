package com.mr486.pizzahut.ingredient;

import com.mr486.pizzahut.Dessert;
import com.mr486.pizzahut.Ingredient;

public class Chantilly extends Ingredient
{

	public Chantilly(Dessert d) {dessert = d;}

	@Override
	public double getPrixIngredient() { return 0.50;}

	@Override
	public String getNameIngredient() { return "chantilly";	}

}
