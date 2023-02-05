package school.management.system;
/**
 Created by King-Spada
 This class is responsible for keeping the track of students
 fees, name, id, grade, fees-paid.

 **/
public class Students {
    //declaring the field
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    // Creating a new constructor -> special function
    /**
    * To create a new student object by initializing
    * Fees for every student is $30,000
    * Fees paid initially is $0.00
    * @param id for the student: unique value
    * @param name of the student: may be unique or not
    * @param grade grades/class of the student
    */
    public Students(int id, String name,int grade){
        //Initializing the field inside constructor
        this.feesPaid =0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    //Not going to alter students name, students id
    // Not going to change feesTotal
    //Going to alter grade
    //Going to update student feesPaid

    /**
    * Used to update the students grade
    * @param grade new grade of student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }
    /*
    *Initially 0 -> paid 10,000-> feesPaid 10,000
    * again, feesPaid = 10,000 + 5,000 + 15,000
    * Basically, fees keep adding to feesPaid Field
    * Add the fees to the feesPaid
    * This schools is going to receive the funds/fees.
    * @param fees the fees that student pays.
    */
    public void updateFeesPaid(int fees){
        feesPaid += fees;
    }

    /**
     * @return id of the student
     */
    public int getId() {
        return id;
    }
    /**
     * @return name of the student
     */
    public String getName() {
        return name;
    }
    /**
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }
    /**
     * @return feesPaid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }
    /**
     * @return fees total of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }
}
