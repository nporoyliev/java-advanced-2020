import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Map<Integer, BankAccount> bankAccounts = new HashMap<> ();

        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine ();


        while (!input.equals ("End")) {

            String[] tokens = scanner.nextLine ().split ("\\s+");

            String command = tokens[0];

            if (command.equals ("Create")) {
                BankAccount bankAccount = new BankAccount ();
                bankAccounts.put (bankAccount.getId (), bankAccount);
            } else if (command.equals ("Deposit")) {

                int id = Integer.parseInt (tokens[1]);
                if (bankAccounts.containsKey (id)) {
                    BankAccount bankAccount = bankAccounts.get (id);
                    bankAccount.deposit (Double.parseDouble (tokens[2]));
                } else {
                    System.out.println ("Account does not exist");
                }

            } else if (command.equals ("SetInterest")) {
                double newInterest = Double.parseDouble (tokens[1]);
                for (BankAccount bankAccount : bankAccounts.values ()) {
                    bankAccount.setInterestRate (newInterest);
                }

            } else {
                int id = Integer.parseInt (tokens[1]);
                if (bankAccounts.containsKey (id)) {
                    BankAccount bankAccount = bankAccounts.get (id);
                    System.out.printf ("%.2f%n", bankAccount.getInterest (10));
                } else {
                    System.out.println ("Account does not exist");
                }
            }
            input = scanner.nextLine ();
        }


    }
}
