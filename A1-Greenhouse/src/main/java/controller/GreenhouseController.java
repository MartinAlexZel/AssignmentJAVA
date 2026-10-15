package controller;
import model.vegetable;
import repository.Repository;

public class GreenhouseController {
    private Repository repo;
    public GreenhouseController(Repository repo){
        this.repo = repo;
    }
    public void addVeg(vegetable v){
        repo.add(v);
    }
    public void removeVeg(int index){
        repo.remove(index);
    }
    public void displayHeavyVegetables(){
        vegetable[] veggies = repo.getAll();
        int currentsize = repo.getSize();
        IO.println("Vegetables with the weight over 0.2 kg are: ");
        for(int i=0;i<currentsize;i++){
            if(veggies[i].checkWeight()){
                IO.println(veggies[i].getName() + " with a weight of "+veggies[i].getWeight()+" kg");
            }
        }
    }
}
