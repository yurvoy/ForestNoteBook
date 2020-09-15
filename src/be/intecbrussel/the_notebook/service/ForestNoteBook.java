package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.animal_entities.Animal;
import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForestNoteBook {

    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();

    private static int plantCount;
    private static int animalCount;

    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();


    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
        animalCount++;

        if (animal instanceof Herbivore){
            herbivores.add((Herbivore) animal);
        }
        if (animal instanceof Carnivore){
            carnivores.add((Carnivore) animal);
        }
        if (animal instanceof Omnivore){
            omnivores.add((Omnivore) animal);
        }
    }

    public void addPlant(Plant plant){
        plants.add(plant);
        plantCount++;
    }

    public void printNotebook(){
        System.out.println("PLANTS");
        plants.forEach(System.out::println);
        System.out.println("\nANIMALS");
        animals.forEach(System.out::println);
    }

    public void sortAllAnimalsByName(){
        animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortAllPlantsByName(){
        plants.sort(Comparator.comparing(Plant::getName));
    }

    public void printHeavyAnimalsCount(){
        System.out.println("HEAVY ANIMALS");
        animals.stream()
                .filter(e -> e.getWeight() > 50)
                .forEach(System.out::println);
    }

    public void printTallAnimals(){
        System.out.println("TALL ANIMALS");
        animals.stream()
                .filter(e -> e.getHeight() > 100)
                .forEach(System.out::println);
    }

    public void sortAllAnimalsByHeight () {
        animals.sort(Comparator.comparingDouble(Animal::getHeight));
    }

    public void sortAllPlantsByHeight () {
        plants.sort(Comparator.comparingDouble(Plant::getHeight));
    }


}
