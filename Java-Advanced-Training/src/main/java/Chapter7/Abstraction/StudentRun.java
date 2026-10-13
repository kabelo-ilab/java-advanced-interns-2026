package Chapter7.Abstraction;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public class StudentRun {
    public static void main(String[] args) {
        PartTimeStudent objSt = new PartTimeStudent("987456", "Caroline", "Smith", "caroline@net.com");
        objSt.setAssessments(74,85,63);
        objSt.display();
    }
}
