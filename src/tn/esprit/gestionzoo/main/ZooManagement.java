package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");

        // Ajout d'animaux aquatiques
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin1 = new Penguin("Spheniscidae", "Skipper", 3, true, "Arctic", 25.3f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Pengy", 2, true, "Arctic", 20.0f);

        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);

        System.out.println("Aquatic Animals in the Zoo:");
        myZoo.displayAquaticAnimals();

        System.out.println("Max Penguin Swimming Depth: " + myZoo.maxPenguinSwimmingDepth());

        myZoo.displayNumberOfAquaticsByType();
    }
}

