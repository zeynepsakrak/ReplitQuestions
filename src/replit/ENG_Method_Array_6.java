package replit;

import java.util.Arrays;

public class ENG_Method_Array_6 {
    public static void main(String[] args) {
        /*
        Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

Input : {3,2,5,4,1,6}

Output :

min: 1

max: 6
         */

        int myArray[]= {3,2,5,4,1,6};
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println("min: "+myArray[0]);
        System.out.println("max: "+myArray[5]);

    }
}
