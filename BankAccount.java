package BankAccounts;

public abstract class BankAccount implements Transaction {
    private int accountID;
    protected double balance;
    protected Customer c;

    private static int accountNb=1;

    public BankAccount(){
        balance=0;
        accountID=accountNb++;
    }
    public BankAccount(String firstName,String lastName,char gender){
        balance=0;
        accountID=accountNb++;
        c=new Customer(firstName,lastName,gender);
    }
    public int getAccountID(){
        return accountID;
    }
    public double getBalance(){
        return balance;
    }
    public boolean equals(Object obj){
        BankAccount B=(BankAccount) obj;
        return B.c.getName()==this.c.getName();
    }
    public String toString(){
        return c.toString()+", the account id is "+getAccountID()+", the account balance is: "+getBalance();
    }
}
