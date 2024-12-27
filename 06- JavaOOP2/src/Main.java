public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Kareem", "23/07/2001", "01/01/2025");

        System.out.println(emp1);
        System.out.println("Age is " + emp1.getAge());
        System.out.println("Pay rate is " + emp1.collectPay());

        Employee emp2 = new Employee("Omar", "01/10/2002", "01/01/2025");
        System.out.println(emp2);
        System.out.println("Age is " + emp2.getAge());
        System.out.println("Pay rate is " + emp2.collectPay());

        SalariedEmployee emp3 = new SalariedEmployee("Ayman", "01/05/2000",
                "01/01/2025", 35000);
        System.out.println(emp3);
        System.out.println("Age is " + emp3.getAge());
        System.out.println("Pay check " + emp3.collectPay());
    }
}
