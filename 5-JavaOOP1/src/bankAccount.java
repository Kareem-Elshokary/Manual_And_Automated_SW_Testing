public class bankAccount {

    //Fields
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;
    private int accountNumber;
    private double accountBalance;


    public String getCustomerName(){     //The getter method returns the value of the private field
        return customerName;
    }
    public String getCustomerEmail(){
        return customerEmail;
    }
    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getAccountBalance(){
        return accountBalance;
    }

    public void setCustomerName(String customerName){    //The setter method takes a parameter and assigns it to the private field
        this.customerName = customerName;
    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }


    //Methods
    public void deposit(int accountID, double balance) {
        if(accountID == accountNumber){
            if(balance > 0){
                accountBalance += balance;
                System.out.println("Successful deposit... balance = " + accountBalance);
            } else {
                System.out.println("Invalid deposit balance");
            }
        } else {
            System.out.println("Wrong account number");
        }
    }

    public void withdraw(int accountID, double balance) {

        if(accountID == accountNumber){
            if( (balance <= 0) || (balance > accountBalance) ){
                System.out.println("Invalid withdraw balance");
            } else {
                accountBalance -= balance;
                System.out.println("Successful withdraw... balance = " + accountBalance);
            }
        } else {
            System.out.println("Wrong account number");
        }
    }
}
