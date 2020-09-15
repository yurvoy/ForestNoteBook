package be.intecbrussel.the_notebook.animal_entities;
import be.intecbrussel.the_notebook.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal {

    private Set<Plant> plantDiet = new HashSet<Plant>();
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
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

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet (Plant plant) {
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return String.format("(Omnivore)    Name: %-10s Weight: %-10.2f Length: %-10.2f Height: %-10.2f MaxFood: %-10.1f Diet: %-10s",
                getName(), getHeight(), getHeight(), getLength(), getMaxFoodSize(), printDiet());
    }
}
