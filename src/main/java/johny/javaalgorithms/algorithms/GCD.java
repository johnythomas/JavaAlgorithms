package johny.javaalgorithms.algorithms;

/**
 * finding the GCD of 2 numbers using Euclid's GCD algorithm
 */
public class GCD {

    /**
     * Method to find GCD
     *
     * @param num1 - first number to find GCD
     * @param num2 - the second number to find GCD
     * @return - GCD of num1 and num2
     */
    public static int findGCD(int num1, int num2) {
        // for the algorithm num1 should be greater than num2
        if (num1 < num2) {
            // swap the numbers if num1 is less than num2
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
        }
        // loop till the remainder of 2 numbers is 0
        while (num1 % num2 != 0) {
            // find the remainder
            int remainder = num1 % num2;
            // as the remainder is not 0 num1 is set as num2
            num1 = num2;
            // also set the num2 as remainder
            num2 = remainder;
        }
        // gcd is num2
        return num2;
    }
}
