package repository;
import model.vegetable;
public interface Repository {
    void add(vegetable veg);
    void remove(int index);
    vegetable[] getAll();
    int getSize();
}
