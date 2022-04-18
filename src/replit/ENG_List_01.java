package replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ENG_List_01 {
    public static void main(String[] args) {
        /*
        Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

input :
Learning java is easy

output:
maximum occurring character is : a
         */
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        List<String> sentence=new ArrayList<String>(List.of(str.split("")));

        int say1=0;
        int say2=0;
        for (int i = 0; i < sentence.size(); i++) {
            for (int j = 1; j < sentence.size() ; j++) {
                if (sentence.get(i)==sentence.get(j)){
                    say1+=1;
                }
                if (say2<say1){
                    
                }
            }

        }

    }
}
