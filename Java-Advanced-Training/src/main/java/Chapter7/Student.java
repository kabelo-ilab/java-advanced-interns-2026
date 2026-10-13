package Chapter7;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public class Student {
    private String studentNum;
    private String firstname;
    private String lastname;
    private String email;
    private int testMark, assignment1, assignment2;

    public Student() {
        studentNum = "000000";
        firstname = "No name";
        lastname = "No lastname";
        email = "none";
        testMark = 0;
        assignment1 = 0;
        assignment2 = 0;
    }

    /**
     * Construct an object of Student with attributes
     * @param studentNum Student Number
     * @param firstname Firstname
     * @param lastname Lastname
     * @param email Email
     */
    public Student(String studentNum, String firstname, String lastname, String email) {
        setStudentNum(studentNum);
        setFirstname(firstname);
        setLastname(lastname);
        setEmail(email);
    }

    /**
     * Set the Student Number with a prefix (ST-26)
     * @param stNum Student Number
     */
    private void setStudentNum(String stNum){
        this.studentNum = "ST-26" + stNum;
    }

    /**
     * Set Student's firstname
     * @param firstname Firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Set Student's lastname
     * @param lastname Lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Set Student's email address
     * @param email Email Address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Set all 3 assessments
     * @param test Test
     * @param assignment1 Assignment 1
     * @param assignment2 Assignment 2
     */
    public void setAssessments(int test, int assignment1, int assignment2){
        this.testMark = test;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
    }

    /**
     * Get the current value of the Student Number
     * @return Student Number
     */
    public String getStudentNum(){
        return studentNum;
    }

    /**
     * Get the current Firstname and Lastname as Full name
     * @return Full name of the Student
     */
    public String getName(){
        return firstname + " " + lastname;
    }

    /**
     * Get the current Student email
     * @return Email
     */
    public String getEmail(){
        return email;
    }

    /**
     * Calculate and get the Semester mark
     * @return Semester Mark
     */
    public double getSemesterMark(){
        //test * 40%, a1 * 35%, a2 * 25%
        return (this.testMark * 0.4) + (this.assignment1 * 0.35) + (this.assignment2 * 0.25);
    }

    /**
     * Display Student Information
     */
    public void display(){
        System.out.println("Student#: " + getStudentNum());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Semester Mark: " + getSemesterMark());
    }

}
