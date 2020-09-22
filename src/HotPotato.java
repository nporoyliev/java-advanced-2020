import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class HotPotato {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String[] children = scanner.nextLine ().split ("\\s+");
        int n = scanner.nextInt ();

        Deque<String> queue = new ArrayDeque<> ();

        for (String s : children) {
            queue.offer (s);
        }

        while (queue.size () > 1) {
            for (int i = 1; i < n; i++) {
                String child = queue.poll ();
                queue.offer (child);
            }
            System.out.println ("Removed " + queue.poll ());
        }
        System.out.println ("Last is " + queue.poll ());
    }
}
