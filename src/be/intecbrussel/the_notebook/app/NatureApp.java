package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

public class NatureApp {

    public static void main(String[] args) {

        ForestNoteBook noteBook = new ForestNoteBook();

        //PLANTS
        Plant cherryTree = new Tree("Cherry tree", 300, LeafType.ROUND);
        Plant appleTree = new Tree("Apple tree", 250, LeafType.ROUND);
        Plant skunk = new Weed("Skunk", 50);
        Plant bushes = new Bush("Bushes", 80, LeafType.NEEDLE);
        Flower roses = new Flower("Roses", 20);
        roses.setSmell(Scent.SWEET);

        //ANIMALS
        Carnivore lion = new Carnivore("Lion", 180, 80, 120);
        Carnivore dog = new Carnivore("Dog", 60, 50, 90);
        Carnivore cat = new Carnivore("Cat", 8, 15, 35);
        Herbivore horse = new Herbivore("Horse", 700, 160, 200);
        Herbivore cow = new Herbivore("Cow", 800, 140, 180);
        Herbivore sheep = new Herbivore("Sheep", 80, 60, 110);
        Omnivore pig = new Omnivore("Pig", 350, 80, 140);
        Omnivore rat = new Omnivore("Rat", 0.3, 5, 10);
        Omnivore raven = new Omnivore("Raven", 0.9, 12, 15);


        //DIETS
        Plant straw = new Plant("Straw");
        Plant grass = new Plant("Grass");
        Plant corn = new Plant("Corn");
        Plant oats = new Plant("Oats");
        Plant barley = new Plant("Barley");
        //herbivores
        horse.addPlantToDiet(straw);
        cow.addPlantToDiet(grass);
        sheep.addPlantToDiet(grass);
        //Omnivores
        pig.addPlantToDiet(corn);
        pig.addPlantToDiet(oats);
        pig.setMaxFoodSize(1);
        rat.addPlantToDiet(corn);
        rat.setMaxFoodSize(4);
        raven.addPlantToDiet(corn);
        raven.addPlantToDiet(barley);
        raven.setMaxFoodSize(5);
        //Carnivores
        dog.setMaxFoodSize(2);
        cat.setMaxFoodSize(1);
        lion.setMaxFoodSize(15);


        //NOTEBOOK DATA
        noteBook.addAnimal(lion);
        noteBook.addAnimal(dog);
        noteBook.addAnimal(cat);
        noteBook.addAnimal(horse);
        noteBook.addAnimal(cow);
        noteBook.addAnimal(sheep);
        noteBook.addAnimal(pig);
        noteBook.addAnimal(rat);
        noteBook.addAnimal(raven);

        noteBook.addPlant(cherryTree);
        noteBook.addPlant(appleTree);
        noteBook.addPlant(skunk);
        noteBook.addPlant(bushes);
        noteBook.addPlant(roses);

        //PRINTS
        System.out.println("\nNumber of animals: " + noteBook.getAnimalCount());
        System.out.println("Number of plants: " + noteBook.getPlantCount()+ "\n");

        noteBook.printNotebook();

        System.out.println("\nCARNIVORES");
        for (Carnivore carnivore : noteBook.getCarnivores()) {
            System.out.println(carnivore);
        }

        System.out.println("\nOMNIVORES");
        for (Omnivore omnivore : noteBook.getOmnivores()) {
            System.out.println(omnivore);
        }

        System.out.println("\nHERBIVORES");
        for (Herbivore herbivore : noteBook.getHerbivores()) {
            System.out.println(herbivore);
        }

        noteBook.sortAllAnimalsByName();
        noteBook.sortAllPlantsByName();
        System.out.println("\n\n***Lists sorted by name***\n");
        noteBook.printNotebook();

        noteBook.sortAllAnimalsByHeight();
        noteBook.sortAllPlantsByHeight();
        System.out.println("\n\n***Lists sorted by height***\n");
        noteBook.printNotebook();

    }

}
