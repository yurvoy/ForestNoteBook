package be.intecbrussel.the_notebook.plant_entities;

public class Bush extends Plant{

    private String fruit;
    private LeafType leafType;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height, LeafType leafType) {
        super(name, height);
        this.leafType = leafType;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }


    @Override
    public String toString() {
        return String.format("(Bush)    Name: %-15s Height: %-10.2f Type: %s", getName(), getHeight(), leafType);
    }
}
