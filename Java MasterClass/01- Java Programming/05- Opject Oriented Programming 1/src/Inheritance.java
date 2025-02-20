/*
    - Inheritance is a concept of OOPs where one class inherits from another
      class that can reuse the methods and fields of the parent class.
    - "extend" keyword is used for inheriting one class into another.
    - Inheritance types:
        Single,
        Multiple,
        Multilevel,
        Hierarchical,
        Hybrid.
*/


// Super/Parent class
class Employee {

    public String empName;
    public int empAge;
    public int empID;
    public double empSalary;

    
}


// Sub/Child class
class Engineers extends Employee {

    public String empDepartment;
    public double empBenefits;

    Engineers(String n, int id, int age, String d, double salary, double benefits){
        empName = n;
        empID   = id;
        empAge  = age;
        empDepartment = d;
        empSalary = salary;
        empBenefits = benefits;
    }

    @Override
    public String toString() {
        return "Engineers{" +
                "empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empID=" + empID +
                ", empSalary=" + empSalary +
                ", empDepartment='" + empDepartment + '\'' +
                ", empBenefits=" + empBenefits +
                "} " + super.toString();
    }

}


public class Inheritance {

    public static void main(String[] args) {

        Engineers eng = new Engineers("Kareem", 1, 23, "Engineering Department",
                15000, 3000);

        System.out.println(eng.toString());
    }


}
