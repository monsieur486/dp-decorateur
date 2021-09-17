package com.mr486.pizzahut;

import java.text.DecimalFormat;

/**
 * The type Dessert.
 */
public abstract class Dessert
{
	private String libelle;// Libellé du dessert.
	private double prix;// Prix du dessert.

  /**
   * Gets libelle.
   *
   * @return the libelle
   */
// Accesseurs en lecture pour le libellé et le prix.
	public String getLibelle()
	{
		return libelle;
	}

  /**
   * Gets prix.
   *
   * @return the prix
   */
  public double getPrix()
	{
		return prix;
	}

  /**
   * Sets libelle.
   *
   * @param libelle the libelle
   */
// Accesseurs en écriture pour le libellé et le prix.
	protected void setLibelle(String libelle)
	{
		this.libelle = libelle;
	}

  /**
   * Sets prix.
   *
   * @param prix the prix
   */
  protected void setPrix(double prix)
	{
		this.prix = prix;
	}

	private static DecimalFormat format = new DecimalFormat("#.##");

	// Méthode utilisée pour l'affichage d'un dessert.
	public String toString()
	{
		var sb = new StringBuilder(getLibelle());
		sb.append(" Total: ");
		sb.append(format.format(getPrix()));
		sb.append("€ dont ");
		sb.append(format.format((getPrix()-getPrix()/1.2)));
		sb.append("€ de TVA");
		return sb.toString();
	}
}
