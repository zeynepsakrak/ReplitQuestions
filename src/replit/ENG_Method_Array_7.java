package replit;

import java.util.Arrays;

public class ENG_Method_Array_7 {
    public static void main(String[] args) {
        /*
        Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.

Eg :

input : {1,2,3,4,5,6,7,8};

output: 36
         */
        int myArray[]= {1,2,3,4,5,6,7,8};
        int top=0;
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            top+=myArray[i];
        }
        System.out.println("Dizi elemanlarının toplam değeri "+top);
    }
}
