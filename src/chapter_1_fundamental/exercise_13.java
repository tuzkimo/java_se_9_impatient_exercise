package chapter_1_fundamental;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Write a program that prints a lottery combination, picking six distinct numbers between 1 and 49.
 * To pick six distinct numbers, start with an array list filled with 1...49.
 * Pick a random index and remove the element. Repeat six times.
 * Print the result in sorted order.
 */
public class exercise_13 {

    public static void main(String[] args) {
        int size = 49;
        Random random = new Random();
        List<Integer> possibles = IntStream.rangeClosed(1, size).boxed().collect(Collectors.toList());
        List<Integer> picked = new ArrayList<>();

        for (int count = 0; count < 6; count++) {
            int pickedIndex = random.nextInt(size - count);
            picked.add(possibles.get(pickedIndex));
            possibles.remove(pickedIndex);
        }

        picked.stream().sorted().forEach(System.out::println);
    }
}
