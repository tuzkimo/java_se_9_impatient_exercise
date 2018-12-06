package chapter_1_fundamental;

import java.util.Random;

/*
 * Write a program that reads in two integers between 0 and 4294967295,
 * stores them in int variables, and computes and displays their unsigned sum,
 * difference, product, quotient, and remainder.
 * Do not convert them to long values.
 */
public class exercise_7 {

    private static int[] getTwoRandomUnsignedIntegers() {
        return new Random()
                .longs(2, 0, 4294967295L)
                .mapToObj(Long::toString)
                .mapToInt(Integer::parseUnsignedInt)
                .toArray();
    }

    private static void printResult(int[] terms, int result, String operator) {
        String term1String = Integer.toUnsignedString(terms[0]);
        String term2String = Integer.toUnsignedString(terms[1]);
        String resultString = Integer.toUnsignedString(result);
        System.out.printf("%s %s %s = %s\n", term1String, operator, term2String, resultString);
    }

    public static void main(String[] args) {
        int[] twoRandomUnsignedIntegers = getTwoRandomUnsignedIntegers();

        int sum = twoRandomUnsignedIntegers[0] + twoRandomUnsignedIntegers[1];
        printResult(twoRandomUnsignedIntegers, sum, "+");

        int difference = twoRandomUnsignedIntegers[0] - twoRandomUnsignedIntegers[1];
        printResult(twoRandomUnsignedIntegers, difference, "-");

        int product = twoRandomUnsignedIntegers[0] * twoRandomUnsignedIntegers[1];
        printResult(twoRandomUnsignedIntegers, product, "*");

        int quotient = Integer.divideUnsigned(twoRandomUnsignedIntegers[0], twoRandomUnsignedIntegers[1]);
        printResult(twoRandomUnsignedIntegers, quotient, "/");

        int remainder = Integer.remainderUnsigned(twoRandomUnsignedIntegers[0], twoRandomUnsignedIntegers[1]);
        printResult(twoRandomUnsignedIntegers, remainder, "%");
    }
}
