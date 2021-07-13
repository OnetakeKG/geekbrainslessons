package HWLS7;

public class Bowl {
    private int food;

    public Bowl (int food) {
     this.food = food;

    }
    public void putFoodIntoBowl(int amount) {
        this.food += amount;
        System.out.printf("Food increased for %d, now: %d\n", amount, this.food);
    }

    public boolean decreaseFoodFromBowl(int amount) {
        if (this.food < amount) {
     System.out.printf("There is not enough food, %d, %d you want", this.food, amount);
     return false;
    }
        this.food -= amount;
        System.out.printf("Food drecreased for %d, now: %d\n", amount, this.food);
        return true;
    }

    public int getFood() {
        return food;
    }
}
