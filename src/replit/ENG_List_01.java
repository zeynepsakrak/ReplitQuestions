package replit;

import java.util.ArrayList;
import java.util.Arrays;
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
            String str = "Learning java is easy";
            System.out.println("The entered string is: "+str);
            int[] freq = new int[str.length()];
            char minChar = str.charAt(0), maxChar = str.charAt(0);
            int i, j, min, max;
            //Verilen dizeyi karakter dizisine dönüştürür
            char string[] = str.toCharArray();
            //Verilen dizedeki her kelimeyi sayın ve dizi frekansında saklayın
            for(i = 0; i < string.length; i++)
            {
                freq[i] = 1;
                for(j = i+1; j < string.length; j++)
                {
                    if(string[i] == string[j] && string[i] != ' ' && string[i] != '0')
                    {
                        freq[i]++;

                        //Ziyaret edilen karakterin yazdırılmasını önlemek için [j] dizesini 0 olarak ayarlayın
                        string[j] = '0';
                    }
                }
            }
            //Minimum ve maksimum meydana gelen karakterleri belirleyin
            min = max = freq[0];
            for(i = 0; i <freq.length; i++)
            {
                if(min > freq[i] && freq[i] != '0')
                {
                    min = freq[i];
                    minChar = string[i];
                }

                if(max < freq[i])
                {
                    max = freq[i];
                    maxChar = string[i];
                }
            }
            //Oluşan minimum ve maksimum karakterleri yazdırın
            System.out.println("Minimum occurring character: " + minChar);
            System.out.println("Maximum occurring character: " + maxChar);
        }
        }

