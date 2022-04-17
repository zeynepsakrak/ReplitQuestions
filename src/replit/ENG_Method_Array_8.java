package replit;

import java.util.ArrayList;
import java.util.Arrays;

public class ENG_Method_Array_8 {
    public static void main(String[] args) {

        /*
        Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

Input1={1,2,3,4}

Input2={5,6}

Output={1,2,3,4,5,6}
         */
        int arr1[]={1,2,3,4};
        int arr2[]={5,6};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            list.add(arr2[i]);
        }
        System.out.println(list);
    }
}
