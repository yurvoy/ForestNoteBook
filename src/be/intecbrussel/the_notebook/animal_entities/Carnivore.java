package be.intecbrussel.the_notebook.animal_entities;

public class Carnivore extends Animal {

    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return String.format("(Carnivore)   Name: %-10s Weight: %-10.2f Length: %-10.2f Height: %-10.2f MaxFood: %-10.1f",
                getName(), getHeight(), getHeight(), getLength(), getMaxFoodSize());
    }
}
