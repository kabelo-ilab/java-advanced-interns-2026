package Chapter7.Inheritance;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public class PermanentEmployee extends Employee {

    private double salary;

    public PermanentEmployee(String empNumber, String name, String email, double sal){
        super(empNumber, name,email);
        this.salary = sal;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void display(){
        System.out.println("Employee#: " + getEmpNumber());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Salary: " + getSalary());
        System.out.println("-------------------------------------------\n");
    }
}
