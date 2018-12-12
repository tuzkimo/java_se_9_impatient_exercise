package chapter_1_fundamental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * Write a program that reads a two-dimensional array of integers
 * and determines whether it is a magic square (that is,
 * whether the sum of all rows, all columns, and the diagonals is the same).
 * Accept lines of input that you break up into individual integers,
 * and stop when the user enters a blank line.
 * For example, with the input
 * 16 3 2 13
 * 5 10 11 8
 * 9 6 7 12
 * 4 15 14 1
 * (Blank line)
 * your program should respond affirmatively.
 */
public class exercise_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<List<Integer>> data = new ArrayList<>();
        int dimension = 0;
        int rows = 0;
        int sum = 0;
        int forwardDiagonalSum = 0;
        int backwardDiagonalSum = 0;

        for (String line = input.nextLine(); !line.isEmpty(); line = input.nextLine()) {
            rows++;
            List<Integer> dataLine = Arrays.stream(line.split("\\s+"))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
            if (dimension == 0) {
                dimension = dataLine.size();
                sum = dataLine.stream().mapToInt(Integer::intValue).sum();
            }
            if (rows > dimension) {
                System.err.println("It's not a square");
                return;
            }
            if (dataLine.size() != dimension) {
                System.err.println("It's not a square");
                return;
            }
            if (dataLine.stream().mapToInt(Integer::intValue).sum() != sum) {
                System.err.println("It's not magic");
                return;
            }
            data.add(dataLine);
        }

        for (int colIndex = 0; colIndex < dimension; colIndex++) {
            int colSum = 0;
            for (int rowIndex = 0; rowIndex < dimension; rowIndex++) {
                colSum += data.get(rowIndex).get(colIndex);
            }
            if (colSum != sum) {
                System.err.println("It's not magic");
                return;
            }
        }

        for (int index = 0; index < dimension; index++) {
            forwardDiagonalSum += data.get(index).get(dimension - index - 1);
            backwardDiagonalSum += data.get(index).get(index);
        }

        if (forwardDiagonalSum != sum || backwardDiagonalSum != sum) {
            System.err.println("It's not magic");
            return;
        }

        System.out.println("It's magic");
    }
}
