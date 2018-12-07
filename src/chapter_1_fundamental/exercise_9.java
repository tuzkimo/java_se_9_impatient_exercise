package chapter_1_fundamental;

import java.util.Arrays;

/*
 * Section 1.5.3, “String Comparison” (page 25) has an example of
 * two strings s and t so that s.equals(t) but s != t.
 * Come up with a different example that doesn't use substring).
 */
public class exercise_9 {

    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "HELLO".toLowerCase();

        System.out.printf("%s equals %s? %b", string1, string2, string1.equals(string2));
        System.out.println();
        System.out.printf("%s == %s? %b", string1, string2, string1 == string2);
    }
}
