// Superclass
class Worker {

    //Fields
    private String workerName;
    private String workerBOD;
    protected String workerEndDate;

    // Constructor
    public Worker(){

    }
    public Worker(String workerName, String workerBOD) {
        this.workerName = workerName;       // 'this.' used to call current class member field/method
        this.workerBOD = workerBOD;
    }

    //Methods
    public int getAge(){
        int currentYear = 2025;
        int birthYear = Integer.parseInt(workerBOD.substring(6));
        return (currentYear - birthYear);
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.workerEndDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerName='" + workerName + '\'' +
                ", workerBOD='" + workerBOD + '\'' +
                ", workerEndDate='" + workerEndDate + '\'' +
                '}';
    }
}

// Subclass
class Employees extends Worker {

    private long employeeID;
    private String employeeHireDate;
    private static int employeeNo = 1;

    public Employees(){

    }
    public Employees(String workerName, String workerBOD, String employeeHireDate) {
        super(workerName, workerBOD);           // 'super' used to call parent class methods/constructor
        this.employeeID = employeeNo++;
        this.employeeHireDate = employeeHireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeHireDate='" + employeeHireDate + '\'' +
                "} " + super.toString();
    }

}

// Subclass
class SalariedEmployee extends Employees {

    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String workerName, String workerBOD, String employeeHireDate, double annualSalary) {
        super(workerName, workerBOD, employeeHireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        return (int) annualSalary / 26;
    }
    public void isRetired(){
        terminate("12/12/2025");
        this.isRetired = true;
    }
}

// Subclass
class HourlyEmployee extends Employees {

    double hourlyPayRate;

    public HourlyEmployee(String workerName, String workerBOD, String employeeHireDate, double hourlyPayRate) {
        super(workerName, workerBOD, employeeHireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        return 40 * hourlyPayRate;
    }
}


public class program4 {

    public static void main(String[] args) {

        Employees emp1 = new Employees("Kareem", "23/07/2001", "01/01/2025");
        System.out.println(emp1);
        System.out.println("Age is " + emp1.getAge());
        System.out.println("Pay rate is " + emp1.collectPay());

        Employees emp2 = new Employees("Omar", "01/10/2002", "01/01/2025");
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
