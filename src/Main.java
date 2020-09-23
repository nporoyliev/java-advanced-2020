import java.util.Scanner;

public class Main {
    public static void main (String[] args) {



        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt (scanner.nextLine ());
            Car car;
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine ().split ("\\s+");

            String brand = tokens[0];
            car = new Car (brand);

            car.setBrand (brand);
            car.setModel (tokens[1]);
            car.setHorsePower (Integer.parseInt (tokens[2]));

            System.out.println (car.carInfo ());
        }

    }
}
