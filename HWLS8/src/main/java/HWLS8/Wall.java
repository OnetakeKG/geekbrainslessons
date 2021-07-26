package HWLS8;

public class Wall implements Obstacle {

    private int height;

    public Wall (int height) {this.height = height;}

    @Override
    public boolean overcome (Participant participant) {

        if (participant.jump(this.height)) {
            System.out.printf("He jumped over the wall.\n");
            return true;
        }
        System.out.printf("He couldn't jumped over the wall.\n");
        return false;
    }

}
