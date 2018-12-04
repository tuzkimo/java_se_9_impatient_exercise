package chapter_1_fundamental;

import java.util.Random;

/*
 * Using only the conditional operator,
 * write a program that reads three integers and prints the largest.
 * Repeat with Math.max.
 */
public class exercise_3 {

//    // handle with conditional operator
//    private static void printMaxIn3Number(int first, int second, int third) {
//        int max = first > second ? first : second;
//        max = max > third ? max : third;
//
//        System.out.printf("The max number in %d, %d, %d is %d\n", first, second, third, max);
//    }

    // handle with Math.max
    private static void printMaxIn3Number(int first, int second, int third) {
        int max = Math.max(first, second);
        max = Math.max(max, third);

        System.out.printf("The max number in %d, %d, %d is %d\n", first, second, third, max);
    }

    public static void main(String[] args) {
        Random random = new Random();
        printMaxIn3Number(random.nextInt(100), random.nextInt(100), random.nextInt(100));
    }
}
