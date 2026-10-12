package Chapter7.Abstraction;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public class PartTimeStudent extends Student{
    /**
     * Calculate and return the Semester Mark
     *
     * @param test        Test Mark as an integer
     * @param assignment1 Assignment 1 Mark as an integer
     * @param assignment2 Assignment 2 Mark as an integer
     * @return Semester Mark
     */
    @Override
    public double calculateSemesterMark(int test, int assignment1, int assignment2) {
        return (test + assignment1 + assignment2) / 3;
    }

    /**
     * Calculate and return the Final Mark
     *
     * @param semesterMark Semester Mark
     * @return Final Mark
     */
    @Override
    public double calculateFinalMark(double semesterMark) {
        return 0;
    }

    /**
     * Display Student details
     */
    @Override
    public void display() {

    }
}
