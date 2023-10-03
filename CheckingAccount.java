package BankAccounts;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String firstName,String lastName,char gender){
        super(firstName,lastName,gender);
    }
    @Override
    public void deposit(double amount){
        balance+=amount;
    }
    @Override
    public void withdraw(double amount){
        try{
            if(balance - amount<0)
               throw new NegativeBalanceException();
            balance-=amount;
        }catch(NegativeBalanceException e){
            System.out.println("Try Again");
        }
    }
}
