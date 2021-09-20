package com.mr486.pizzahut.ingredient;

import com.mr486.pizzahut.Dessert;
import com.mr486.pizzahut.Ingredient;

/**
 * The type Sucre.
 */
public class Sucre extends Ingredient {

  /**
   * Instantiates a new Sucre.
   *
   * @param d the d
   */
  public Sucre(Dessert d) {
    dessert = d;
  }

  @Override
  public double getPrixIngredient() {
    return 0.10;
  }

  @Override
  public String getNameIngredient() {
    return "sucre";
  }

}
