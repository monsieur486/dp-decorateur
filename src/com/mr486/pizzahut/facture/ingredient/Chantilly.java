package com.mr486.pizzahut.facture.ingredient;

import com.mr486.pizzahut.facture.Dessert;
import com.mr486.pizzahut.facture.Ingredient;

public class Chantilly extends Ingredient
{

	public Chantilly(Dessert d) {dessert = d;}

	@Override
	public double getPrixIngredient() { return 0.50;}

	@Override
	public String getNameIngredient() { return "chantilly";	}

}
