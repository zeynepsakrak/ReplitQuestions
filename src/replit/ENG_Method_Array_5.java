package replit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ENG_Method_Array_5 {
    public static void main(String[] args) {
        /*
        Write a java program that calculates the average value of array elements

input[]= {1,2,3,4,5,6,7}

Output : 4
         */
        int myArray[]= {1,2,3,4,5,6,7};
        int top=0;
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            top+=myArray[i];
        }
        System.out.println("Dizi elemanlarının ortalama değeri "+(top/ myArray.length));
    }
}
