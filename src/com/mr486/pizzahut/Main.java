package com.mr486.pizzahut;

import com.mr486.pizzahut.dessert.Crepe;
import com.mr486.pizzahut.dessert.Gaufre;
import com.mr486.pizzahut.ingredient.BouleVanille;
import com.mr486.pizzahut.ingredient.Chantilly;
import com.mr486.pizzahut.ingredient.Chocolat;

/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Création et affichage d'une gaufre au Nutella.
        Dessert d1 = new Gaufre();
        d1 = new Chocolat(d1);
        System.out.println(d1);
        // Création et affichage d'une crêpe au Nutella et chantilly.
        Dessert d2 = new Crepe();
        d2 = new Chocolat(d2);
        d2 = new Chantilly(d2);
        System.out.println(d2);
        // Création et affichage d'une crêpe au Nutella, chantilly et 2 boules de vanille.
        // Reprise du dessert 2
        d2 = new BouleVanille(d2);
        d2 = new BouleVanille(d2);
        System.out.println(d2);
    }
}
