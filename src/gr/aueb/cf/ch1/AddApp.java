package gr.aueb.cf.ch1;

/**
 * Calculates the sum of two integers
 *  and the result is printed at console
 *  (standard output).
 */

public class AddApp {
    public static void main(String[] args) {
        // Δήλωση και Αρχικοποίηση Μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;
        // Εντολές
        result = num1 + num2;
        // Εκτύπωση του αποτελέσματος
        System.out.println("αποτελεσμα έιναι : "+ result);
        System.out.println("το αθροισμα των:" + num1 + " , " + num2 + " ,ειναι ισο με:" + result );
        System.out.printf("το άθροισμα των %d , %d ,ειναι ισο με: %d\n" , num1 , num2 , result );
    }
}
