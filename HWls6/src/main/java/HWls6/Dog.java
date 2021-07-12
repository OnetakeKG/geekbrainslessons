package HWls6;

public class Dog extends Animal {
    @Override
    public void animalRun (int distance, String name) {
        if (distance < 500) System.out.println(name + " ran " + distance + " meters");
        else System.out.println("Dog " + name + " can't ran " + distance + " meters");

    }
    @Override
    public void animalSwim (int distance, String name) {
        if (distance < 10) System.out.println(name + " ran " + distance + " meters");
        else System.out.println("Dog " + name + " can't swim " + distance + " meters");

    }

}
