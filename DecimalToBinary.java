/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 3
   Question 4 (DecimalToBinary.java)
 */

import java.util.*;

public class DecimalToBinary {
    public static String dec2Bin(int decimal) {
        int remainder = 0;
        String binary = "";

        if (decimal==0) {
            return "(0)_2";
        }

        while (decimal>0) {
            remainder=decimal%2;
            binary=remainder+binary;
            decimal/=2;
        }

        String answer = "("+binary+")_2";

        return answer;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter decimal: ");
        int decimal = s.nextInt();

        System.out.print("Binary: "+dec2Bin(decimal));
    }
}
