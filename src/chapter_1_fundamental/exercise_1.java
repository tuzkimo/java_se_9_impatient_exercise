package chapter_1_fundamental;

/*
 * Write a program that reads an integer and prints it in binary, octal, and hexadecimal.
 * Print the reciprocal as a hexadecimal floating-point number.
 */
public class exercise_1 {

    private static void printBinary(int number) {
        String binaryString = Integer.toBinaryString(number);

        System.out.println(number + "convert to binary is: ");
        System.out.println(binaryString);
    }

    private static void printOctal(int number) {
        String octalString = Integer.toOctalString(number);

        System.out.println(number + "convert to octal is: ");
        System.out.println(octalString);
    }

    private static void printHex(int number) {
        String hexString = Integer.toHexString(number);

        System.out.println(number + "convert to hexadecimal is: ");
        System.out.println(hexString);
    }

    private static void printReciprocal(int number) {
        double reciprocal = 1.0 / number;

        System.out.println(number + "convert to it's reciprocal is: ");
        System.out.println(reciprocal);
    }

    public static void main(String[] args) {
        int number = 16;

        printBinary(number);
        printOctal(number);
        printHex(number);
        printReciprocal(number);
    }
}
