package com.mr486.pizzahut;

/**
 * The type Ingredient.
 */
public abstract class Ingredient extends Dessert
{
  /**
   * The Dessert.
   */
  protected Dessert dessert;

  /**
   * Gets prix ingredient.
   *
   * @return the prix ingredient
   */
  public abstract double getPrixIngredient();

  /**
   * Gets name ingredient.
   *
   * @return the name ingredient
   */
  public abstract String getNameIngredient();

	public String getLibelle(){	return dessert.getLibelle()+", "+getNameIngredient();}

	public double getPrix()
	{
		return dessert.getPrix()+getPrixIngredient();
	}

}
