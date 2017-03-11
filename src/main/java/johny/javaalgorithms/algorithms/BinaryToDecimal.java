package johny.javaalgorithms.algorithms;

/**
 * class to convert binary number to decimal number
 */
public class BinaryToDecimal {

    private final int BASE = 2;

    /**
     * converts binary number given to decimal number
     *
     * @param binaryNumber - the binary number
     * @return - decimal representation of the binary number given
     */
    public int convertBinaryToDecimal(int binaryNumber) {

        /* the variable to store the decimal value */
        int decimalNumber = 0;
        /* represent the power of 2 */
        int power = 0;
        /* we will divide the binary number by 10 and multiply with the power of 2 till the binary number is 0 */
        while (binaryNumber > 0) {
            /*
             * finding the decimal number. eg: 10 is equal to (1 * (2 ^ 1)) + (0 * (2 ^ 0)).
             * Here each digit of the binary is taken and multiplied with appropriate power of 2 and we add them to get the decimal
             */
            decimalNumber += Math.pow(BASE, power) * binaryNumber % 10;
            /* after taking the last bit from the binary we remove that bit by dividing it with 10 */
            binaryNumber /= 10;
            /* the power of 2 will be incremented in each iteration */
            power++;
        }
        /* return the decimal number */
        return decimalNumber;
    }
}
