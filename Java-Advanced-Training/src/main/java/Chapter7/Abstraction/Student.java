package Chapter7.Abstraction;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public abstract class Student {

    /**
     * Calculate and return the Semester Mark
     * @param test Test Mark as an integer
     * @param assignment1 Assignment 1 Mark as an integer
     * @param assignment2 Assignment 2 Mark as an integer
     * @return Semester Mark
     */
    public abstract double calculateSemesterMark(int test, int assignment1, int assignment2);

    /**
     * Calculate and return the Final Mark
     * @param semesterMark Semester Mark
     * @return Final Mark
     */
    public abstract double calculateFinalMark(double semesterMark);

    /**
     * Display Student details
     */
    public abstract void display();
}
