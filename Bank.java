package BankAccounts;

public class Bank {
    private BankAccount[] accounts;
    private int numBankAccounts;    

    public Bank(int arraySize){
        numBankAccounts=0;
        if(arraySize==0)
            accounts=new BankAccount[100];
        accounts=new BankAccount[arraySize];
    }
    public int getNumBankAccounts(){
        return numBankAccounts;
    }
    public BankAccount[] getAccount(){
        return accounts;
    }
    public void printAccounts(){              
        for(BankAccount account : accounts)
            System.out.println(account.toString());
    }
    public BankAccount searchAccountByID(int id){
        for(BankAccount account : accounts)
            if(account.getAccountID()==id)
               return account;
        return null;
    }
    public BankAccount searchAccountByNameID(String name,int id){
        for(BankAccount account : accounts)
            if(account.getAccountID()==id && account.c.getName().equals(name))
                return account;
        return null;
    }
   public void applyInterest(){
    for(BankAccount account : accounts)
        if(account instanceof SavingsAccount)
            ((SavingsAccount) account).applyInterest();
   }
}

