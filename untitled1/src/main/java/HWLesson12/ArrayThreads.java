package HWLesson12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayThreads {

    public static void main(String[] args) {
        makeArray(10000000);
        makeArray2(10000000);



    }

    public static void makeArray(int size) {
        float[] newArr = new float[size];
        for (int i = 0; i < newArr.length; i++) {

            newArr[i] = 1;
        }
        long a = System.currentTimeMillis();
        System.out.println("For makeArray time - " + a);
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = (float) (newArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }
        System.out.println("For makeArray time - " + (System.currentTimeMillis() - a));
    }

    public static void makeArray2(int size) {
        float[] newArr = new float[size];
        float[] myArray1 = Arrays.copyOfRange(newArr, 0, newArr.length / 2);
        float[] myArray2 = Arrays.copyOfRange(newArr, newArr.length / 2, newArr.length);
        Thread thread1 = new Thread(() -> makeArray(myArray1.length));
        Thread thread2 = new Thread(() -> makeArray(myArray2.length));

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("You caught an exception");
            e.printStackTrace();
            return;
        }
        System.arraycopy(myArray1,0,newArr,0,(newArr.length)/2);
        System.arraycopy(myArray2,0,newArr,(newArr.length)/2,(newArr.length)/2);


    }
}


