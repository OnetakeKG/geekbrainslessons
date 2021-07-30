package HWLesson11;

import java.util.ArrayList;
import java.util.List;

public class Box <F extends Fruit> {
    private List<F> fruits;

   public Box () {
   this.fruits = new ArrayList<>();}

    public void add (F fruit) {
       this.fruits.add(fruit);
    }

    public float getWeight() {

       float weight = 0.0F;
       for (F fruit : fruits){
           weight =+ fruit.getWeight();
       }
       return weight;
    }
    public boolean compare (Box<?> another){

       return Math.abs(getWeight() - another.getWeight()) < 0.0001;
    }

    public List<F> getFruits() {
        return fruits;
    }
    public void swap(Box<? super F> another) {
        if (this == another) return;
        another.getFruits().addAll(fruits);
        fruits.clear();
    }

}