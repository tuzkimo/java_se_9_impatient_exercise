package chapter_1_fundamental;

import java.util.Random;

/*
 * Write a program that produces a random string of letters and digits
 * by generating a random long value and printing it in base 36.
 */
public class exercise_10 {

    public static void main(String[] args) {
        Random random = new Random();
        long randomLong = random.nextLong();
        String randomLongBase36 = Long.toString(randomLong, 36);
        System.out.printf("The base 36 represent of %d is %s\n", randomLong, randomLongBase36);
    }
}
