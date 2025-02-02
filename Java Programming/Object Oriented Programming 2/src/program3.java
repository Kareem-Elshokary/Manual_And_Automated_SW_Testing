//Superclass
class Employee {

    //Fields
    public String empName;
    public int empID;
    public double empSalary;

    //Constructor
    public Employee(String empName, int empID, double empSalary) {
        this.empName = empName;
        this.empID = empID;
        this.empSalary = empSalary;
    }
}


//Subclass
class Manager extends Employee{

    //Fields
    public int teamSize;

    //constructor
    public Manager(String empName, int empID, double empSalary, int teamSize) {
        super(empName, empID, empSalary);
        this.teamSize = teamSize;
    }

    //Methods
    public double calculateBonus(){
        double bonus = empSalary * .15 + teamSize * 50;
        return bonus;
    }

    @Override
    public String toString() {
        return "Manager {" +
                "empName= '" + empName + '\'' +
                ", empID= " + empID +
                "teamSize= " + teamSize +
                ", empSalary= " + empSalary +
                ", Bonus= " + calculateBonus() +
                "} ";
    }
}


//Subclass
class Developer extends Employee {

    //Fields
    public String empDepartment;

    //Constructor
    public Developer(String empName, int empID, double empSalary, String empDepartment) {
        super(empName, empID, empSalary);
        this.empDepartment = empDepartment;
    }

    //Methods
    public void code(String programmingLanguage){
        System.out.println("Department of " + empDepartment);
        System.out.println(programmingLanguage + " code");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "empName='" + empName + '\'' +
                ", empID=" + empID +
                ", empDepartment='" + empDepartment + '\'' +
                ", empSalary=" + empSalary +
                "} ";
    }
}


public class program3 {

    public static void main(String[] args) {
        Manager manager = new Manager("Kareem", 1, 30000, 5);
        Developer developer = new Developer("Mohamed", 1, 20000, "BackEnd");

        System.out.println(manager.toString());
        System.out.println(developer.toString());
        developer.code("Java");
    }

}
