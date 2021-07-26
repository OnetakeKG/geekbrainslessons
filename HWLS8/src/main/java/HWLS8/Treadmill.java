package HWLS8;

public class Treadmill implements Obstacle {

    private int distance;

    public Treadmill (int distance) {this.distance = distance;}

    @Override
    public boolean overcome (Participant participant) {

        if (participant.run(this.distance)) {
            System.out.printf("He ran out the track.\n");
            return true;
        }
        System.out.printf("He couldn't rran out the track.\n");
        return false;
    }

}
