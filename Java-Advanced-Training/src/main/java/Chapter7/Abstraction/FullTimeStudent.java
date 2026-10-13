package Chapter7.Abstraction;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public class FullTimeStudent extends Student{

    private double examMark;

    public FullTimeStudent(String studentNum, String firstname, String lastname, String email) {
        super(studentNum, firstname, lastname, email);
    }

    public double getExamMark() {
        return examMark;
    }

    public void setExamMark(double examMark) {
        this.examMark = examMark;
    }

    /**
     * Calculate and return the Semester Mark
     *
     * @return
     */
    @Override
    public double calculateSemesterMark() {
        return (testMark * 0.34) + (assignment1 * 0.33) + (assignment2 * 0.33);
    }

    /**
     * Calculate and return the Final Mark
     *
     * @return Final Mark
     */
    @Override
    public double calculateFinalMark() {
        return (calculateSemesterMark() + getExamMark() / 2);
    }

    /**
     * Display Student details
     */
    @Override
    public void display() {

    }
}
