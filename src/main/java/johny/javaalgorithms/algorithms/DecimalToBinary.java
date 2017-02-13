package johny.javaalgorithms.algorithms;

public class DecimalToBinary {


    public String convertDecimalToBinary(int decimalNumber) {
        /* the result will be stored in reverse order in this variable */
        StringBuilder binaryInReverse = new StringBuilder();

        /* do the operation till the decimal number is greater than 0 */
        while(decimalNumber > 0) {
            /* divide the decimal number and get the remainder and append it to the binaryInReverse */
            binaryInReverse.append(decimalNumber % 2);
            /* after taking the remainder make the decimal number as decimalNumber / 2 for the next iteration */
            decimalNumber /= 2;
        }
        /* return the string representation of the reverse of binaryInReverse */
        return binaryInReverse.reverse().toString();
    }
}
