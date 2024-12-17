public class Customer {

    //Fields
    private String customerName;
    private String customerEmail;
    private double creditLimit;

    //Constructor
    public Customer(){
        this("Default Name", "Defualt@gmail.com", 0);
    }
    public Customer(String customerName, String customerEmail, double creditLimit){
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.creditLimit = creditLimit;
    }

    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerEmail(){
        return customerEmail;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
}
