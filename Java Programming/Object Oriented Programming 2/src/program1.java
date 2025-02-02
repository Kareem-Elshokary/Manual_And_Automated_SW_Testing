import java.util.Scanner;

class BankAccount {

    //Properties
    private String accNumber;
    private String accHolderName;
    private String accHolderContact;
    private double accBalance;

    //Constructor
    public BankAccount(String accNumber, String accHolderName, String accHolderContact) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.accHolderContact = accHolderContact;
    }

    //Getters and Setters for data
    public String getAccNumber() {
        return accNumber;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public String getAccHolderContact() {
        return accHolderContact;
    }

    public double getAccBalance() {
        return accBalance;
    }
    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    //Methods for deposit and withdraw
    public void deposit(double amount)
    {
        if (amount <= 0){
            System.out.println("Invalid operation");
            return;
        }
        setAccBalance(amount + getAccBalance());
    }

    public void withdraw(double amount)
    {
        if (amount > getAccBalance()){
            System.out.println("Can not done this operation");
            return;
        }
        setAccBalance(getAccBalance() - amount);
    }

    @Override
    public String toString() {
        return
                "accNumber= '" + accNumber + '\'' +
                ", accHolderName= '" + accHolderName + '\'' +
                ", accHolderContact= '" + accHolderContact + '\'' +
                ", accBalance= " + accBalance;
    }

}




public class program1 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        String textBlock = """
                Choose an operation:
                1. Deposit
                2. Withdraw
                3. Inquiry
                4. Exit
                """;

        //Init accounts
        BankAccount acc1, acc2, acc3;
        acc1 = new BankAccount("122", "Kareem Abdelkader", "1122557");
        acc2 = new BankAccount("233", "Omar Ehab", "1168685");
        acc3 = new BankAccount("344", "Ahmed Omar", "2278878");

        //Get a specific account number
        System.out.println("Welcome to our System.... ");
        System.out.println("Enter your account number: ");
        int accNum = scan.nextInt();


        while(flag){
            System.out.println(textBlock);
            int choose = scan.nextInt();

            if (choose == 4)
            {
                flag = false;
                break;
            }
            else
            {
                if(accNum == 122){
                    switch (choose){
                        case 1:
                            System.out.println("Enter the amount: ");
                            double amountD = scan.nextDouble();
                            acc1.deposit(amountD);
                            System.out.println("Your Balance is: " + acc1.getAccBalance());
                            break;
                        case 2:
                            System.out.println("Enter the amount: ");
                            double amountW = scan.nextDouble();
                            acc1.withdraw(amountW);
                            System.out.println("Your Balance is: " + acc1.getAccBalance());
                            break;
                        case 3:
                            System.out.println(acc1.toString());
                            break;
                    }

                } else if (accNum == 233) {
                    switch (choose){
                        case 1:
                            System.out.println("Enter the amount: ");
                            double amountD = scan.nextDouble();
                            acc2.deposit(amountD);
                            System.out.println("Your Balance is: " + acc2.getAccBalance());
                            break;
                        case 2:
                            System.out.println("Enter the amount: ");
                            double amountW = scan.nextDouble();
                            acc2.withdraw(amountW);
                            System.out.println("Your Balance is: " + acc2.getAccBalance());
                            break;
                        case 3:
                            System.out.println(acc2.toString());
                            break;
                    }

                } else if (accNum == 344) {
                    switch (choose){
                        case 1:
                            System.out.println("Enter the amount: ");
                            double amountD = scan.nextDouble();
                            acc3.deposit(amountD);
                            System.out.println("Your Balance is: " + acc3.getAccBalance());
                            break;
                        case 2:
                            System.out.println("Enter the amount: ");
                            double amountW = scan.nextDouble();
                            acc3.withdraw(amountW);
                            System.out.println("Your Balance is: " + acc3.getAccBalance());
                            break;
                        case 3:
                            System.out.println(acc3.toString());
                            break;
                    }

                }
        }

        }


    }

}
