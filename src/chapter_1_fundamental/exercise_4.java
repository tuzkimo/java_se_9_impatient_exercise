package chapter_1_fundamental;

/*
 * Write a program that prints the smallest and largest positive double values.
 * Hint: Look up Math.nextUp in the Java API.
 */
public class exercise_4 {

    private static void printSmallestAndLargestPositiveDouble() {
        double smallest = Math.nextUp(0.0);
        double largest = Double.MAX_VALUE;

        System.out.printf("The smallest positive double is %f\nand largest one is %f", smallest, largest);
    }

    public static void main(String[] args) {
        printSmallestAndLargestPositiveDouble();
    }
}
