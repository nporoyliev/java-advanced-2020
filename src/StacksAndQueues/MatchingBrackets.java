package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String exp = scanner.nextLine ();

        ArrayDeque<Integer> stack = new ArrayDeque<> ();

        for (int i = 0; i < exp.length (); i++) {
            if (exp.charAt (i) == '(') {
                stack.push (i);
            }
            if (exp.charAt (i) == ')') {
                System.out.println (exp.substring (stack.pop (), i + 1));
            }
        }
    }
}
