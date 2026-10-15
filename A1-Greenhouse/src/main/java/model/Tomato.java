package model;

public class Tomato implements vegetable {
    private String name;
    private double weight;

    public Tomato(String name,double weight){
        this.name =name;
        this.weight = weight;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getWeight(){
        return weight;
    }
    @Override
    public boolean checkWeight(){
        return weight>0.2;
    }
}
