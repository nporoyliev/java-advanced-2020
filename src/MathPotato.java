import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split("\\s+");
        int num = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        int prime = 1;
        for (String value : line) {
            queue.offer (value);
        }
        while (queue.size() > 1){
            for (int i = 0; i < num-1; i++) {
                String name = queue.poll();
                queue.offer(name);
            }
            if (isPrime(prime)){
                System.out.println("Prime "+queue.peek());
            }else {
                System.out.println("Removed "+queue.poll());
            }
            prime++;
        }
        for (String s : queue) {
            System.out.println("Last is " + s);
        }
    }
    public static boolean isPrime(int num){
        if (num ==1)return false;
        for (int i = 2; i < num; i++) {
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}