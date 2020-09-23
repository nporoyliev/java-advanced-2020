import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine ();

        Map<Integer,BankAccount> bankAccounts = new HashMap<>();

        while(!input.equals ("End")){

            String[] tokens = input .split ("\\s+");

            switch (tokens[0]){
                case"Create":
                    BankAccount bankAccount = new BankAccount ();
                    bankAccounts.put (bankAccount.getId(), bankAccount);
                    break;
                case"Deposit":
                    int id = Integer.parseInt (tokens[1]);
                    if (bankAccounts.containsKey (id)){
                        bankAccount = bankAccounts.get (id);
                        bankAccount.deposit (Double.parseDouble (tokens[2]));
                    } else {
                        System.out.println ("Account does not exist");
                    }
                    break;
                case"SetInterest":
                    double interest = Double.parseDouble (tokens[1]);
                    for (BankAccount value : bankAccounts.values ()) {
                        value.setInterestRate (interest);
                    }
                    break;
                case"GetInterest":
                    id = Integer.parseInt (tokens[1]);
                    if (bankAccounts.containsKey (id)){
                        bankAccount = bankAccounts.get (id);
                        System.out.printf ("%.2f%n", bankAccount.getInterestRate (Integer.parseInt (tokens[2])));
                    } else {
                        System.out.println ("Account does not exist");
                    }
                    break;

            }

            input = scanner.nextLine ();
        }

        System.out.println ();
    }
}
