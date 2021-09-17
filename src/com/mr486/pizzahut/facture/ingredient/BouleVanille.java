package com.mr486.pizzahut.facture.ingredient;

import com.mr486.pizzahut.facture.Dessert;
import com.mr486.pizzahut.facture.Ingredient;

public class BouleVanille extends Ingredient
{

	public BouleVanille(Dessert d) {dessert = d;}

	@Override
	public double getPrixIngredient() { return 1;}

	@Override
	public String getNameIngredient() { return "Boule vanille";	}

}
