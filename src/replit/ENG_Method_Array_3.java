package replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ENG_Method_Array_3 {
    public static void main(String[] args) {
        /*Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.
        Bir String'i parametre olarak kabul eden ve verilen string'de bulunan rakamların toplamını yazdıran bir metot yazın.

input : ade1r4d3

output : 8

Hint :
     Use Character.isDigit()
     Integer.valueOf()*/


//HATA VAR!!
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        List<String> sentence=new ArrayList<String>(List.of(str.split("")));
        System.out.println(sentence);

        rakamlarToplamı(sentence);
    }

    private static void rakamlarToplamı(List<String> sentence) {
        List<Integer> rakam = new ArrayList<>();
        boolean check=false;
        for (int i = 0; i < sentence.size(); i++) {
            if (Character.isDigit(sentence.get(i).charAt(i))) {
                System.out.println(sentence.get(i) + " rakamdır");
            } else {
                System.out.println(sentence.get(i) + " rakam değil");

            }
            check=false;

        }
    }
}



