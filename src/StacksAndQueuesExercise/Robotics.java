package StacksAndQueuesExercise;

import java.util.*;

public class Robotics {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        Map<String, Integer> robotsMap = new HashMap<> ();

        String[] input = scanner.nextLine ().split (";");
        for (String s : input) {
            String[] split = s.split ("-");
            String name = split[0];
            int time = Integer.parseInt (split[1]);

            robotsMap.put (name, time);
        }

        String[] time = scanner.nextLine ().split (":");
        int hours = Integer.parseInt (time[0]);
        int minutes = Integer.parseInt (time[1]);
        int seconds = Integer.parseInt (time[2]);
        int startTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        String product;
        Deque<String> products = new ArrayDeque<> ();

        while (!(product = scanner.nextLine ()).equals ("End")) {
            products.add (product);
        }

        boolean isAvailable = true;
        while (!products.isEmpty ()) {
            startTimeInSeconds++;
            int s = startTimeInSeconds % 60;
            int m = (startTimeInSeconds / 60) % 60;
            int h = (startTimeInSeconds / (60 * 60)) % 60;

            for (Map.Entry<String, Integer> robot : robotsMap.entrySet ()) {
                
            }
        }

    }
}
