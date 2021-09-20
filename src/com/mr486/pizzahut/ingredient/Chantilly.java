package com.mr486.pizzahut.ingredient;

import com.mr486.pizzahut.Dessert;
import com.mr486.pizzahut.Ingredient;

/**
 * The type Chantilly.
 */
public class Chantilly extends Ingredient {

  /**
   * Instantiates a new Chantilly.
   *
   * @param d the d
   */
  public Chantilly(Dessert d) {
    dessert = d;
  }

  @Override
  public double getPrixIngredient() {
    return 0.50;
  }

  @Override
  public String getNameIngredient() {
    return "chantilly";
  }

}
