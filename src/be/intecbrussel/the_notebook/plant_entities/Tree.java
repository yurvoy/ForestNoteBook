package be.intecbrussel.the_notebook.plant_entities;

public class Tree extends Plant {

    private LeafType leafType;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height, LeafType leafType) {
        super(name, height);
        this.leafType = leafType;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }


    @Override
    public String toString() {
        return String.format("(Tree)    Name: %-15s Height: %-10.2f Type: %s", getName(), getHeight(), leafType);
    }
}
