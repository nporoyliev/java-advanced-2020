package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BasicStackOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.nextLine();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        List<Integer> inputData = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            numbers.push(inputData.get(i));
        }

        while (s-- > 0 && !numbers.isEmpty()) {
            numbers.pop();
        }


        if (numbers.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(numbers.contains(x) ? "true" : getMinNumber(numbers));
        }
    }

    private static int getMinNumber(ArrayDeque<Integer> numbers) {
        int result = Integer.MAX_VALUE;
        int tempNumber;
        while (!numbers.isEmpty()) {
            tempNumber = numbers.pop();
            if (result > tempNumber) {
                result = tempNumber;
            }
        }
        return result;
    }
}
