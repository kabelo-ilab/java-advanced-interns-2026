package Chapter7.Inheritance;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public class EmployeeRunner {
    public static void main(String[] args) {
        PermanentEmployee objPEmp = new PermanentEmployee("123456","Jessica Smith", "jess@net.com", 15500);

        ContractEmployee objCEmp = new ContractEmployee("987654","Mike Ross", 38, 250.75);

        objPEmp.display();

        objCEmp.display();
    }
}
