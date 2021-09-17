package com.mr486.pizzahut.ingredient;

import com.mr486.pizzahut.Dessert;
import com.mr486.pizzahut.Ingredient;

public class BouleVanille extends Ingredient
{

	public BouleVanille(Dessert d) {dessert = d;}

	@Override
	public double getPrixIngredient() { return 1;}

	@Override
	public String getNameIngredient() { return "Boule vanille";	}

}
