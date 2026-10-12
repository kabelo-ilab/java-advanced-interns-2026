package Chapter7;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public class StudentRunner {
    public static void main(String[] args) {

        Student objStudent = new Student();
        Student objThabo = new Student("123456", "Thabo", "Smith", "thabos@net.com");
        objThabo.setAssessments(75,74,63);

        System.out.println("=====Default Constructor=====");
        objStudent.display();
        System.out.println("\n=====Overloaded Constructor=====");
        objThabo.display();
    }
}
