package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        //Δηλωση και Αρχικοποιηση Μεταβλητων

        int leftDigital = 0 ;
        int rightDigital = 0;
        int inputNum ;
        int  sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("διαλεξτε εναν αριθμο με δυο ψηφια");
          inputNum = in.nextInt();

         leftDigital = inputNum / 10;
         rightDigital = inputNum % 10;
         sum = leftDigital + rightDigital;

        System.out.printf("το αθροισμα του %d, και του %d , ειναι: %d" , leftDigital , rightDigital , sum);

    }
}
