import java.util.Arrays;

public class hometask_lesson2<array> {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(task3(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        System.out.println(task5(1,2,3,123));
        System.out.println(task51(1,2,3,123));
    }
        // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        static void task1 (int[] arr){

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] > 0) arr[i] = 0;
                else arr[i] = 1;
            }
        }
        static int[] task2 (int razmer, int step){

        int[] arr1 = new int[razmer];
        for (int i =0; i < arr1.length; i++) arr1[i] += step;

            return arr1;
        }
        static int[] task3 (int[] arr) {

            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i=0; i<array.length; i++ ){

                if (array [i]<6) array[i]*=2;
            }

            return array;
        }

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
    // цикла(-ов) заполнить его диагональные элементы единицами;
    static int[][] task4 (int size, int number) {

        int array[][] = new int[size][size];
        for (int i = 0; i < array.length; i++) {

            array[i][i] = number;
            array[i][array.length - 1 - i] = number;

        }

        return array;
    }



    static int task5 (int... arr) {
        int max = arr[0];
     for (int i = 0; i<arr.length; i++){


         if (arr[i]>max) max = arr[i];
     }
        return max;
    }

    static int task51 (int... arr) {
        int min = arr[0];
        for (int i = 0; i<arr.length; i++){


            if (arr[i]<min) min = arr[i];
        }
        return min;
    }

    static boolean task6 (int[] arr) {

        int sum = 0;
        for (int i = 0; i<arr.length; i++){

            sum += arr[i];
        }
        if (sum % 2 !=0) return false;

        int half = 0;
        sum = sum /2;
        for (int i = 0; i<arr.length; i++) {
            half = half + arr[i];
            if (half ==sum) return true;

        }
        return false;
    }

    static void task7(int[] arr, int n) {
        int change = (arr.length + n % arr.length) % arr.length;

        for (int i = 0; i < change; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }
}

