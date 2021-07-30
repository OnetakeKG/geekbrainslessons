package HWLesson11;

//Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа)


import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class SwitchElements {


    public static void SwitchElements(Object[] arr, int eInd1, int eInd2) {
        Object helper = arr[eInd1];
        arr[eInd1] = arr[eInd2];
        arr[eInd2] = helper;

    }

    // Написать метод, который преобразует массив в ArrayList
    public static List<Object> ReworkingArray(Object[] arr) {
        List<Object> listOfObjects = new ArrayList<>();
        Collections.addAll(listOfObjects, arr);
        return listOfObjects;


    }

    public static void main(String[] args) {
        Object [] arrayOfStrings = {1,2,3,4,5};
        ReworkingArray(arrayOfStrings);
        System.out.println(arrayOfStrings);
        SwitchElements(arrayOfStrings,3,2);
        System.out.println(arrayOfStrings);

    }

}




