public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int idCounter = 1;
    private  int id;
    private double balance;

    public BankAccount(){
        this.id = idCounter++;
    }

    public void setInterestRate (double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterest (int years){
        return BankAccount.interestRate * years * this.balance;
    }

    public void deposit (double amount){
        this.balance += amount;
        System.out.println ("Deposited "+ amount + "to ID " + this.id);
    }

    public Integer getId () {
        return this.id;
    }
}
