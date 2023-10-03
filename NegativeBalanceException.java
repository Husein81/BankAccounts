package BankAccounts;

public class NegativeBalanceException extends RuntimeException{
    public NegativeBalanceException(){
        super("Negative balance not allowed");
    }
    public NegativeBalanceException(String message){
        super(message);
    }
}