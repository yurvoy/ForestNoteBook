package be.intecbrussel.the_notebook.animal_entities;
import be.intecbrussel.the_notebook.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal {

    private Set<Plant> plantDiet = new HashSet<Plant>();

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }


    private String printDiet(){
        String diets = "";
        for (Plant plant : plantDiet) {
            diets += plant.getName() + ", ";
        }
        return diets.substring(0, diets.length() - 2);
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet (Plant plant) {
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return String.format("(Herbivore)   Name: %-10s Weight: %-10.2f Length: %-10.2f Height: %-30.2f Diet: %s",
                getName(), getHeight(), getHeight(), getLength(), printDiet());
    }
}