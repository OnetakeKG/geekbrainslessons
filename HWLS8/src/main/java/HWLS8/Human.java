package HWLS8;

public class Human implements Participant {
    private String name;
    private int maxDistance;
    private int maxHeight;


    public Human (String name, int maxDistance, int maxHeight){
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;

    }
    @Override
    public boolean run (int distance) {
        return this.maxDistance >= distance;
    }
    @Override
    public boolean jump (int height) {
        return this.maxHeight >= height;
    }
}