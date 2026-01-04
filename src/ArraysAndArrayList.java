import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAndArrayList {
     static void main (String[] args){
        int[] arrA = new int[5];
        int[] arrB = {1, 3, 4};

        for(int i = 0; i < arrA.length; i++){
            arrA[i] = i * 2;
        }

        System.out.println(Arrays.toString(arrA));
        System.out.println(Arrays.toString(arrB));

        ArrayList<Integer> arrC = new ArrayList<>(Arrays.asList(1,2,3));
        for(int i: arrC){
            System.out.println(i);
        }
    }
}
