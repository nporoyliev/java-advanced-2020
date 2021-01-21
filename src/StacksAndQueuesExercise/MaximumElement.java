package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        int commandsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commandsCount; i++) {
            List<Integer> tokens = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                    .collect(Collectors.toList());
            int command = tokens.get(0);
            if (command == 1) {
                int number = tokens.get(1);
                numbers.push(number);
            } else if (command == 2) {
                numbers.pop();
            } else {
                printMaxNumber(numbers);
        }
    }
}

    private static void printMaxNumber(ArrayDeque<Integer> numbers) {
        int maxNumber = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (number > maxNumber){
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
    }
}
