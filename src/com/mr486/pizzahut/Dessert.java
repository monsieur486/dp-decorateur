package com.mr486.pizzahut;

import java.text.DecimalFormat;

/**
 * The type Dessert.
 */
public abstract class Dessert {
  private static final DecimalFormat format = new DecimalFormat("####0.00");
  private String libelle; // Libellé du dessert.
  private double prix; // Prix du dessert.

  /**
   * Accesseurs en lecture pour le libellé.
   *
   * @return le libellé
   */
  public String getLibelle() {
    return libelle;
  }


  /**
   * Sets libelle.
   *
   * @param libelle le libellé
   */
  protected void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  /**
   * Accesseurs en lecture pour le prix.
   *
   * @return le prix
   */
  public double getPrix() {
    return prix;
  }

  /**
   * Accesseurs en écriture pour le prix.
   *
   * @param prix le prix
   */
  protected void setPrix(double prix) {
    this.prix = prix;
  }

  /**
   * Affiche facture.
   *
   * @return affichage complet de la facture
   */
  public String toString() {
    var sb = new StringBuilder(getLibelle());
    sb.append(" Total: ");
    sb.append(format.format(getPrix()));
    sb.append("€ dont ");
    sb.append(format.format((getPrix() - getPrix() / (1 + config.taux_tva))));
    sb.append("€ de TVA");
    return sb.toString();
  }
}
