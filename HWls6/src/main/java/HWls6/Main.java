package HWls6;

public class Main {

    public static void main (String[] args){
        Cat animal2 = new Cat();
        Dog animal1 = new Dog();


        animal1.animalRun(600, "kluv");
        animal2.animalSwim(600, "pushok");
        animal1.animalSwim(600, "Kluvik");

        Animal [] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();

        for (int i = 0; i<animals.length; i++ ) {
            int distance = 10 + 100;
            animals[i].animalRun(distance,"One more");
            animals[i].animalSwim(distance,"One more");

        }
    }

}
