package com.mr486.pizzahut;

import java.text.DecimalFormat;

/**
 * The type Dessert.
 */
public abstract class Dessert {
  private static final DecimalFormat format = new DecimalFormat("####0.00");
  private String libelle;
  private double prix;

  /**
   * Gets libelle.
   *
   * @return the libelle
   */
  public String getLibelle() {
    return libelle;
  }

  /**
   * Accesseur en écriture pour le libellé.
   *
   * @param libelle the libelle
   */
  protected void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  /**
   * Accesseur en lecture pour le prix.
   *
   * @return the prix
   */
  public double getPrix() {
    return prix;
  }

  /**
   * Sets prix.
   *
   * @param prix the prix
   */
  protected void setPrix(double prix) {
    this.prix = prix;
  }

  /**
   * Méthode utilisée pour l'affichage d'un dessert.
   */
  public String toString() {
    var sb = new StringBuilder(getLibelle());
    sb.append(": ");
    sb.append(format.format(getPrix()));
    sb.append("€ dont ");
    sb.append(format.format((getPrix() - getPrix() / (1 + config.taux_tva))));
    sb.append("€ de TVA");
    return sb.toString();
  }
}
