package controller;
import model.vegetable;
import repository.InMemoryRepo;
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
    public vegetable[] displayHeavyVegetables(){
        vegetable[] veggies = repo.getAll();
        int currentsize = repo.getSize();
         vegetable[] newveggies= new vegetable[currentsize];
        int count=0;
        for(int i=0;i<currentsize;i++){
            if(veggies[i].checkWeight()){
                newveggies[count]=veggies[i];
                count++;
            }
        }
        return newveggies;
    }
}
