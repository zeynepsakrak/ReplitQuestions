package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ENG_Method_Array_1 {
    public static void main(String[] args) {
        /*Write a return method to reverse number.

Input : 12345
Output : 54321*/
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();

        System.out.print("girilen sayının tersi: ");
        while (sayi>0){
            System.out.print(sayi%10);
            sayi/=10;
        }



    }
}
