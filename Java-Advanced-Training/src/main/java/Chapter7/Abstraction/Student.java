package Chapter7.Abstraction;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public abstract class Student {

    protected String studentNum;
    protected String firstname;
    protected String lastname;
    protected String email;
    protected int testMark, assignment1, assignment2;

    public Student(String studentNum, String firstname, String lastname, String email) {
        this.studentNum = studentNum;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    /**
     * Calculate and return the Semester Mark
     * @return Semester Mark
     */
    public abstract double calculateSemesterMark();

    /**
     * Calculate and return the Final Mark
     * @return Final Mark
     */
    public abstract double calculateFinalMark();

    /**
     * Display Student details
     */
    public abstract void display();
}
