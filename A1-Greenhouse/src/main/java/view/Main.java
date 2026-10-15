package view;
import controller.GreenhouseController;
import model.vegetable;
import model.Eggplant;
import model.Pepper;
import model.Tomato;
import repository.InMemoryRepo;
import repository.Repository;

public class Main {
    public static void main() {
        Repository repo = new InMemoryRepo(10);
        GreenhouseController ctrl = new GreenhouseController(repo);
        ctrl.addVeg(new Tomato("Rosie cherry", 0.1));
        ctrl.addVeg(new Tomato("Rosie romaneasca", 0.67));
        ctrl.addVeg(new Tomato("Rosie de galati", 0.21));
        ctrl.addVeg(new Tomato("Rosie verde", 0.17));
        ctrl.addVeg(new Eggplant("Vanata mica", 0.5));
        ctrl.addVeg(new Eggplant("Vanata mare", 1.266));
        ctrl.addVeg(new Pepper("Ardei gras", 0.69));



        ctrl.removeVeg(1);

        IO.println("\nExec2: ");
        IO.println("Vegetables with the weight over 0.2 kg are: ");
        vegetable[] veggies = ctrl.displayHeavyVegetables();
        int i=0;
        while(veggies[i]!=null) {
            IO.println(veggies[i].getName() + " with a weight of " + veggies[i].getWeight() + " kg");
            i++;
        }


    }
}

