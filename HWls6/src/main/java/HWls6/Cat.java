package HWls6;

public class Cat extends Animal {
    @Override
    public void animalRun (int distance, String name) {
        if (distance < 200) System.out.println(name + " ran " + distance + " meters");
        else System.out.println("Cat " + name + " can't ran " + distance + " meters");

    }
    @Override
    public void animalSwim (int distance, String name) {
        System.out.println("Cat " + name + " can't swim ");

    }


}
