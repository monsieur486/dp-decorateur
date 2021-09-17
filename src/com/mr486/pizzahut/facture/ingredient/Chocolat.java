package com.mr486.pizzahut.facture.ingredient;

import com.mr486.pizzahut.facture.Dessert;
import com.mr486.pizzahut.facture.Ingredient;

public class Chocolat extends Ingredient
{

	public Chocolat(Dessert d) {dessert = d;}

	@Override
	public double getPrixIngredient() { return 0.30;}

	@Override
	public String getNameIngredient() { return "Nutella";	}

}
