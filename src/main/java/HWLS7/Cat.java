package HWLS7;

public class Cat {

        private String name;
        private int appetite;
        private boolean satiety;




        public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.satiety = false;
        }

        public boolean eat(Bowl bowl) {
            if (bowl.decreaseFoodFromBowl(appetite)) {
                this.satiety = true;
                System.out.printf("Cat %s ate for %d food and satiety = %b\n", this.name, this.appetite, this.satiety);

                return true;
            }
        System.out.printf("Cat %s not enough food, satiety = %b\n", this.name,this.satiety);
            return false;
        }



        public String getName() {
            return name;
        }

        public int getAppetite() {
            return appetite;
        }


}
