/*
*   Java Masterclass
*   Kareem Abdelkader
*
*   Inheritance allows a class 'child/subclass' to acquire fields and methods of
*   another class 'parent/superclass'.
* */

// Superclass
public class Worker {

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
class Employee extends Worker {

    private long employeeID;
    private String employeeHireDate;
    private static int employeeNo = 1;

    public Employee(){

    }
    public Employee(String workerName, String workerBOD, String employeeHireDate) {
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
class SalariedEmployee extends Employee {

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
class HourlyEmployee extends Employee {

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