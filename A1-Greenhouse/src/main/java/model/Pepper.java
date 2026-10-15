package model;

public class Pepper implements vegetable {
    private String name;
    private double weight; // în kg

    public Pepper(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String getName() { return name; }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public boolean checkWeight() {
        return weight > 0.2;
    }
}