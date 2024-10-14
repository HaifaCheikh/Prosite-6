package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {
    private String name;
    private String city;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private int animalCount;
    private int aquaticCount;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[25];
        this.aquaticAnimals = new Aquatic[10];
        this.animalCount = 0;
        this.aquaticCount = 0;
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount < animals.length) {
            animals[animalCount++] = animal;
            return true;
        }
        return false;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount++] = aquatic;
        }
    }

    public void displayAquaticAnimals() {
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                System.out.println(aquatic);
                aquatic.swim();
            }
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }

    @Override
    public String toString() {
        return "Zoo{ Name: " + name + ", City: " + city + "}";
    }
}

