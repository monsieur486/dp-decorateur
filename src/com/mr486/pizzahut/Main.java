package com.mr486.pizzahut;

import com.mr486.pizzahut.facture.Dessert;
import com.mr486.pizzahut.facture.dessert.Crepe;
import com.mr486.pizzahut.facture.dessert.Gaufre;
import com.mr486.pizzahut.facture.ingredient.BouleVanille;
import com.mr486.pizzahut.facture.ingredient.Chantilly;
import com.mr486.pizzahut.facture.ingredient.Chocolat;

public class Main {

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
