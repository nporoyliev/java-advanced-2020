import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        Stack<Integer> stack = new Stack<> ();

        int decimal = scanner.nextInt ();

        while (decimal != 0) {
            stack.push (decimal % 2);
            decimal /= 2;
        }

        while (!stack.isEmpty ()){
            System.out.print (stack.pop ());
        }
    }
}
