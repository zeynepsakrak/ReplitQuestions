package replit;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ENG_Method_Array_2 {
    public static void main(String[] args) {
        /*Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

Input : Coding is greate.

Output : .etaerg si gnidoC*/
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        List<String> sentence=new ArrayList<String>(List.of(str.split("")));


        terstenyazdir(sentence);

    }
    private static void terstenyazdir(List<String> sentence) {
        for (int i = sentence.size()-1; i >= 0 ; i--) {
            System.out.print(sentence.get(i));
        }

    }


}
