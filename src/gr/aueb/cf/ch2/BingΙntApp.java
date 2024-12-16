package gr.aueb.cf.ch2;
/**
 * BigInteger class demo.
 */
import java.math.BigInteger;

public class BingΙntApp {
    public static void main(String[] args) {
        // Declarations and Initializations
        BigInteger bigNum1 = new BigInteger("3216549846516");
        BigInteger bigNum2 = new BigInteger("6514654646541");
        BigInteger result;
        // Commands
        result = bigNum1.add(bigNum2);
        // Printing the results
        System.out.printf("%,d" , result );
    }

}
