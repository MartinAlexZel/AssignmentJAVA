package repository;
import exceptions.exception;
import model.vegetable;
public class InMemoryRepo implements Repository {
    private vegetable[] vegetables;
    private int size,capacity;
    public InMemoryRepo(int capacity){
        this.capacity=capacity;
        this.size=0;
        this.vegetables = new vegetable[capacity];
    }
    @Override
    public void add(vegetable veg){
        if(size >= capacity){
            throw new exception("Capacity reached");
        }
        vegetables[size]=veg;
        size++;
    }
    @Override
    public void remove(int index){
        if(index>=size || index<0){
            throw new exception("Index out of bounds");
        }
        for(int i=index;i<size-1;i++){
            vegetables[i]=vegetables[i+1];
        }
        size--;
        vegetables[size] = null;
    }
    @Override
    public int getSize(){
        return this.size;
    }
    @Override
    public vegetable[] getAll(){
        return this.vegetables;
    }
}
