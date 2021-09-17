package com.mr486.pizzahut;

public abstract class Ingredient extends Dessert
{
	protected Dessert dessert;

	public abstract double getPrixIngredient();
	public abstract String getNameIngredient();

	public String getLibelle(){	return dessert.getLibelle()+", "+getNameIngredient();}

	public double getPrix()
	{
		return dessert.getPrix()+getPrixIngredient();
	}

}
