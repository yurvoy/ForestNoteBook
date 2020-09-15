package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

import java.util.BitSet;
import java.util.Random;
import java.util.Set;

public class NatureApp2 {

    public static void main(String[] args) {

        ForestNoteBook noteBook = new ForestNoteBook();

        //PLANTS
        Plant cherryTree = new Tree("Cherry tree", 300, LeafType.ROUND);
        Plant appleTree = new Tree("Apple tree", 250, LeafType.HEART);
        Plant skunk = new Weed("Skunk", 50);
        Plant bushes = new Bush("Bushes", 80, LeafType.NEEDLE);
        Flower roses = new Flower("Roses", 20);
        roses.setSmell(Scent.SWEET);

        //ANIMALS
        animalsCreator(noteBook);

        //PLANT TO NOTEBOOK DATA
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
        noteBook.getCarnivores().forEach(System.out::println);

        System.out.println("\nOMNIVORES");
        noteBook.getOmnivores().forEach(System.out::println);

        System.out.println("\nHERBIVORES");
        noteBook.getHerbivores().forEach(System.out::println);

        noteBook.sortAllAnimalsByName();
        noteBook.sortAllPlantsByName();
        System.out.println("\n\n***Lists sorted by name***\n");
        noteBook.printNotebook();

    }


    private static void animalsCreator (ForestNoteBook notebook){
        Random rnd = new Random();
        String[] carnivores = {"Lion", "Dog", "Cat"};
        String[] omnivores = {"Pig", "Raven", "Rat"};
        String[] herbivores = {"Horse", "Cow", "Sheep"};

        String[] bushes = {"Straw", "Grass"};
        String[] cereals = {"Corn", "Oats", "Barley"};

        for (int i = 0; i < carnivores.length; i++) {
            Carnivore carnivore = new Carnivore(carnivores[i], rnd.nextInt(1000), rnd.nextInt(300), rnd.nextInt(200));
            Omnivore omnivore = new Omnivore(omnivores[i], rnd.nextInt(1000), rnd.nextInt(300), rnd.nextInt(200));
            Herbivore herbivore = new Herbivore(herbivores[i], rnd.nextInt(1000), rnd.nextInt(300), rnd.nextInt(200));

            herbivore.addPlantToDiet(new Plant (bushes[rnd.nextInt(bushes.length)]));
            omnivore.addPlantToDiet(new Plant (cereals[rnd.nextInt(cereals.length)]));
            omnivore.addPlantToDiet(new Plant (cereals[rnd.nextInt(cereals.length)]));

            omnivore.setMaxFoodSize(rnd.nextInt(20));
            carnivore.setMaxFoodSize(rnd.nextInt(20));

            notebook.addAnimal(carnivore);
            notebook.addAnimal(omnivore);
            notebook.addAnimal(herbivore);
        }
    }

}
