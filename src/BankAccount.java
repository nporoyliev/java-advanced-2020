public class BankAccount {
    private static int idCounter = 1;
    private int id;
    private double balance;
    private double interestRate;


    public BankAccount () {
        this.id = idCounter++;
        this.interestRate = 0.02;
        System.out.println ("Account ID" + this.id + " created");
    }

    public void setInterestRate (double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate (int years) {
        return this.interestRate * years * this.balance;
    }

    public void deposit (double amount) {
        this.balance += amount;
        System.out.printf ("Deposited %.0f to ID%d%n", amount, this.id);
    }

    public Integer getId () {
        return this.id;
    }
}