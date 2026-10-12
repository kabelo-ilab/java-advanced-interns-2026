package Chapter7.Inheritance;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String empNumber, String name, int hours, double rate){
        super(empNumber, name, " ");
        setHourlyRate(rate);
        setHoursWorked(hours);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void display(){
        System.out.println("Employee#: " + getEmpNumber());
        System.out.println("Name: " + getName());
        System.out.println("Rate: " + getHourlyRate());
        System.out.println("Hours: " + getHoursWorked());
        System.out.println("-------------------------------------------\n");
    }
}
