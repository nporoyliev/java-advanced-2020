package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        Deque<String> stack = new ArrayDeque<> ();
        Deque<String> forwardStack = new ArrayDeque<> ();

        String input = scanner.nextLine ();

        while (!"Home".equalsIgnoreCase (input)) {

            switch (input) {
                case "back":
                    if (stack.size() > 1) {
                       forwardStack.push (stack.pop ());
                        System.out.println (stack.peek ());
                    } else {
                        System.out.println ("no previous URLs");
                    }
                    break;
                case "forward":
                    if (forwardStack.isEmpty ()){
                        System.out.println ("no next URLs");
                    } else {
                        System.out.println (forwardStack.pop ());
                    }
                    break;
                default:
                    stack.push (input);
                    System.out.println (stack.peek ());
                    forwardStack.clear ();
                    break;
            }
            input = scanner.nextLine ();
        }
    }
}
