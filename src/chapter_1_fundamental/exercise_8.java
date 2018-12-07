package chapter_1_fundamental;

import java.util.Arrays;
import java.util.Random;

/*
 * Write a program that reads a string and prints all of its nonempty substrings.
 */
public class exercise_8 {

    private static void printAllSubstring(String string) {
        String[] allSubstrings = string.trim().split("\\s+");
        System.out.printf("All substring of [%s] is:\n", string);
        Arrays.stream(allSubstrings).forEach(System.out::println);
    }

    public static void main(String[] args) {
        String longString = "   stay hungry, stay foolish   ";
        printAllSubstring(longString);
    }
}
