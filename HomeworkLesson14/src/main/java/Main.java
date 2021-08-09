import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array444 = {4,2,3,3,5,6,7,8,9,10,11,12};
        int[] array14 = {4,4,4,1,1,4};
        System.out.println(Arrays.toString(newArray(array444)));
        System.out.println(fourAndOne(array14));


    }
    public static int [] newArray (int [] array) {
                for (int i = array.length-1; i>=0; i--) {
            if (array[i] == 4) return Arrays.copyOfRange(array,i+1, array.length);
        }
                throw new RuntimeException("There is no 4 in array!");


}
    public static boolean fourAndOne (int [] array){
        boolean a = false;
        boolean b = false;

        for (int i = 0; i<array.length; i++){
            if (array[i]==4) a = true;
            else if (array[i]==1) b = true;
            else return false;
        }
        return (a && b);

    }
}
