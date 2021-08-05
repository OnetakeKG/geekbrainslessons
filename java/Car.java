import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private static int winners = 0;
    private Race race;
    private int speed;
    private String name;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            HWLesson13.BARRIER.await();
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }

            checkWinner();
            HWLesson13.BARRIER.await();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void checkWinner() {
        synchronized (race.getMon()) {
            if (winners++ == 0) {
                System.out.println("У нас есть победитель:  " + this.name);
            } else {
                System.out.println(this.name + " пришел " + winners + "м!");
          }
        }
    }
    }



