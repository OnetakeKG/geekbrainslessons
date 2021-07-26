package HWLS8;

public class HomeWorkLs8 {

    public static void main(String[] args) {

    Participant [] participants = {
            new Cat("Kluv1", 500,900),
            new Cat("Kluv2", 999,100),
            new Robot("robo1", 9582,10000),
            new Robot("robo2", 999,999),
            new Human("Kira", 150,100),
            new Human("Kirill", 350,900),

    };
    Obstacle [] obstacles = {
            new Treadmill(9),
            new Wall(50),
            new Wall(999),
            new Treadmill(400),
            new Wall(600),
            new Treadmill(700),

    };

    for (Participant p: participants) {
        for (Obstacle o: obstacles) {
            if (!o.overcome(p)) break;
        }
    }
    }
}
