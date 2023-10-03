package BankAccounts;

public class SavingsAccount extends BankAccount {
    private double transactionFee;
    private int numberOfTransactions;
    public final double INTEREST_RATE=0.04;
    public  final int ALLOWED_TRANSACTIONS = 5;

    public SavingsAccount(String firstName, String lastName, char gender) {
        super(firstName, lastName, gender);
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        if (transactionFee < 0.02 || transactionFee > 0.07)
            this.transactionFee = 0.04;
        this.transactionFee = transactionFee;
    }

    public void applyInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
    }

    @Override
    public void deposit(double amount) {
        if(ALLOWED_TRANSACTIONS>=numberOfTransactions)
            balance+=amount;
        balance-=transactionFee;
        numberOfTransactions++;
    }
    @Override 
    public void withdraw(double amount){
        try{
            if(balance-amount<0)
               throw new NegativeBalanceException();
            if(numberOfTransactions<=ALLOWED_TRANSACTIONS)
                balance-=amount;
            balance-=transactionFee;
            numberOfTransactions++;
        }catch(NegativeBalanceException e){
            System.out.println("Try Again");
        }
    }
}
