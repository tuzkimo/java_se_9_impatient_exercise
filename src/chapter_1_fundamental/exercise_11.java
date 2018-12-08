package chapter_1_fundamental;

import java.util.Scanner;

/*
 * Write a program that reads a line of text and prints all characters that are not ASCII,
 * together with their Unicode values.
 */
public class exercise_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("just tell me something:");
        String string = input.nextLine();

        int[] codePointsWithoutAscii = string.codePoints().filter(value -> value > 128).toArray();
        String stringWithoutAscii = new String(codePointsWithoutAscii, 0, codePointsWithoutAscii.length);

        System.out.println("What you said without ascii is: " + stringWithoutAscii);
    }
}
