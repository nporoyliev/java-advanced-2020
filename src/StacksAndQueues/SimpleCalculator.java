package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class SimpleCalculator {
    public static void main (String[] args) {


        Scanner scanner = new Scanner (System.in);

        String[] input = scanner.nextLine ().split ("\\s+");

        Stack<String> stack = new Stack<> ();

        for (int i = input.length; i > 0; i--) {
            stack.push(input[i-1]);
        }

        while  (stack.size ()>1){
            int first = Integer.parseInt (stack.pop ());
            String op = stack.pop ();
            int second = Integer.parseInt (stack.pop ());

            switch(op){
                case "+":
                    stack.push (first + second + "");
                    break;
                case"-":
                    stack.push ( first - second + "");
                    break;
            }
        }
        System.out.println (stack.pop ());
    }
}
