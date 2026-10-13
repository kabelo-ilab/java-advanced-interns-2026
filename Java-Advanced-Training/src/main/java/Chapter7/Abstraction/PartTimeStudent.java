package Chapter7.Abstraction;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public class PartTimeStudent extends Student{

    public PartTimeStudent(String studentNum, String firstname, String lastname, String email) {
        super(studentNum,firstname,lastname,email);
    }

    public void setAssessments(int test, int assignment1, int assignment2){
        this.testMark = test;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
    }

    /**
     * Calculate and return the Semester Mark
     *
     * @return Semester Mark
     */
    @Override
    public double calculateSemesterMark() {
        return (this.testMark * 0.4) + (this.assignment1 * 0.35) + (this.assignment2 * 0.25);
    }

    /**
     * Calculate and return the Final Mark
     *
     * @return Final Mark
     */
    @Override
    public double calculateFinalMark() {
        return calculateSemesterMark();
    }

    /**
     * Display Student details
     */
    @Override
    public void display() {
        System.out.format("""
                Student Number      %s
                Name                %s %s
                Email               %s
                Semester Mark       %.2f
                Final Mark          %.2f""", this.studentNum, this.firstname, this.lastname, this.email,
                                                calculateSemesterMark(), calculateFinalMark());

    }
}
