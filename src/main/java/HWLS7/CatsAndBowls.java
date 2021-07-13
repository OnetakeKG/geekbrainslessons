package HWLS7;

public class CatsAndBowls {

    public static void main(String[] args) {

        Bowl bowl = new Bowl(100);
        bowl.putFoodIntoBowl(70);
        Cat cats[] = {
                new Cat("Murzik", 150),
                new Cat("Kluvik", 34),
                new Cat("Vitya", 20)
        };
        for (Cat cat: cats) {
            cat.eat(bowl);
        }
        System.out.println(bowl.getFood());

    }
}