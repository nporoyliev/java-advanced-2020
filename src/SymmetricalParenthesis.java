import java.util.Scanner;
import java.util.Stack;

public class SymmetricalParenthesis {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine ();

        Stack<Character> stack = new Stack<> ();
        boolean isAnagram = true;
        for (int i = 0; i < input.length (); i++) {
                switch (input.charAt (i)) {
                    case '[':
                    case '(':
                    case '{':
                        stack.push (input.charAt (i));
                        break;
                    case '}':
                        if (!stack.pop ().equals ('{')) {
                            isAnagram = false;
                        }
                            break;
                    case ']':
                        if (!stack.pop ().equals ('[')) {
                            isAnagram = false;
                        }
                        break;
                    case ')':
                        if (!stack.pop ().equals (')')) {
                            isAnagram = false;
                        }
                        break;
            }
            if (!isAnagram){
                break;
            }
        }
        System.out.println (isAnagram ? "Yes" : "No");

    }
}
