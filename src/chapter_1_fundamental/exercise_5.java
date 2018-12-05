package chapter_1_fundamental;

/*
 * What happens when you cast a double to an int that is larger than the largest possible int value? Try it out.
 */
public class exercise_5 {

    // Will cut to max int value
    public static void main(String[] args) {
        int bigDoubleCastToInt = (int) Double.MAX_VALUE;

        System.out.println(bigDoubleCastToInt);
    }
}
