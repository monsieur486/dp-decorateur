package com.mr486.pizzahut.ingredient;

import com.mr486.pizzahut.Dessert;
import com.mr486.pizzahut.Ingredient;

/**
 * The type Boule vanille.
 */
public class BouleVanille extends Ingredient {

	/**
	 * Instantiates a new Boule vanille.
	 *
	 * @param d the d
	 */
	public BouleVanille(Dessert d) {
		dessert = d;
	}

	@Override
	public double getPrixIngredient() {
		return 1;
	}

	@Override
	public String getNameIngredient() {
		return "Boule vanille";
	}

}
