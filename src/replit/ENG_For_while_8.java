package replit;

public class ENG_For_while_8 {
    public static void main(String[] args) {
        /*Write a Java program that prints ascii values of characters from ‘a’ to ‘z’

Expected Output:

Ascii value of a = 97
 Ascii value of b = 98
 Ascii value of c = 99
 Ascii value of d = 100
 Ascii value of e = 101
 Ascii value of f = 102
 Ascii value of g = 103
 Ascii value of h = 104
 Ascii value of i = 105
 Ascii value of j = 106
 Ascii value of k = 107
  .
  .
  .
  */
        char karakter='a';
        while (karakter<='z'){
            int asci=karakter;
            System.out.println("Ascii value of " + karakter+" = "+asci);
            karakter++;
        }
    }
}
