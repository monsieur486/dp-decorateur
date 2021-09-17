package com.mr486.pizzahut.facture.ingredient;

import com.mr486.pizzahut.facture.Dessert;
import com.mr486.pizzahut.facture.Ingredient;

public class Sucre extends Ingredient
{

	public Sucre(Dessert d) {dessert = d;}

	@Override
	public double getPrixIngredient() { return 0.10;}

	@Override
	public String getNameIngredient() { return "sucre";	}

}
