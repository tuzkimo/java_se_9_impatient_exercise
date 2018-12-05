package chapter_1_fundamental;

import java.math.BigInteger;

/*
 * Write a program that computes the factorial n! = 1 × 2 × ... × n, using BigInteger. Compute the factorial of 1000.
 */
public class exercise_6 {

    private static BigInteger getFactorial(int number) {
        BigInteger result = BigInteger.ONE;

        for (int index = 1; index <= number; index++) {
            result = result.multiply(BigInteger.valueOf(index));
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 1000;

        System.out.printf("The factorial of %d is:\n%d", number, getFactorial(number));
    }
}
