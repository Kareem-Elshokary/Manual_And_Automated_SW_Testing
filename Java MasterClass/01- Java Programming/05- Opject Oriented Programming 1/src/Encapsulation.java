/*
    - Encapsulation it is a protective shield that prevents the data from being
      accessed by the code outside this shield.
    - Encapsulation can be achieved by Declaring all the variables in the class as private
      and writing public methods in the class to set and get the values of variables.
*/


import java.util.Scanner;

class Account {

    //Properties
    private String accName;
    private String accNumber;
    private String accPassword;
    private double accAmount;

    //Setter methods
    public void setAccName(String accName) {
        this.accName = accName;
    }
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }
    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword;
    }
    public void setAccAmount(double accAmount) {
        this.accAmount = accAmount;
    }

    //Getter methods
    public String getAccName() {
        return accName;
    }
    public String getAccNumber() {
        return accNumber;
    }
    public String getAccPassword() {
        return accPassword;
    }
    public double getAccAmount() {
        return accAmount;
    }


}

public class Encapsulation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Account acc1 = new Account();
        acc1.setAccNumber("1");
        acc1.setAccAmount(1000.0);

        Account acc2 = new Account();
        acc2.setAccNumber("2");
        acc2.setAccAmount(1000.0);

        System.out.println("Enter your Name: ");
        acc1.setAccName(scan.nextLine());

        System.out.println("Enter account Password: ");
        acc1.setAccPassword(scan.nextLine());

        System.out.println("Account NO " + acc1.getAccNumber() + " -> name: " + acc1.getAccName()
                            + ", Amount: " + acc1.getAccAmount());


    }

}
