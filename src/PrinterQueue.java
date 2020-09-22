import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class PrinterQueue {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        Queue<String> queue = new ArrayDeque<> ();
        String input = scanner.nextLine ();

        while (!"print".equals (input)) {

            if (!"cancel".equals (input)){
                queue.offer (input);
            } else {
                if (queue.isEmpty ()){
                    System.out.println ("Printer is on standby");
                } else {
                    System.out.println ("Canceled " + queue.poll ());
                }
            }

            input = scanner.nextLine ();
        }

        while (!queue.isEmpty ()){
            System.out.println (queue.poll ());
        }
    }
}
