package BankAccounts;

public class Customer {
    private String firstName,lastName;
    private char gender;
    public Customer(){}
    public Customer(String firstName,String lastName,char gender){
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public String getName(){
        return getFirstName()+" "+getLastName();
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setName(String firstName,String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String toString(){
        return "The account name is:"+getName()+",the gender is: "+getGender();
    }
}
