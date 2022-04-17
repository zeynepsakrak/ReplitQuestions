package replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ENG_Method_Array_4 {
    public static void main(String[] args) {
        /*
        Create a custom return type method accepts a name as parameter and prints the name as a char array.

(do not use toCharArray() method)

Input : John

Output :[J, o, h, n]
         */


        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        List<String> sentence=new ArrayList<String>(List.of(str.split("")));
        System.out.println(sentence);
    }
}
