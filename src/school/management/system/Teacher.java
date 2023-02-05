package school.management.system;
/**
 Created by King-Spada
 This class is responsible for keeping the track of teachers.
 names, id, salary.

 **/

public class Teacher {
    //Declaring the fields
    private int id;
    private String name;
    private int salary;

    // Creating a constructor
    /**
     * This constructor is responsible for creating new teachers object.
     * @param id id for the teacher. not going to change id, if its set
     * @param name name of the teacher. not going to change name, if its set
     * @param salary salary of the teacher. going to change id, if it's a promotion
     * **/
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    // we need to get id, name and salary of the teacher
    /**
     *
     * @return salary for the teacher
     * */
    public  int getSalary(){
        return salary;
    }
    /**
     *
     * @return id for the teacher
     * */
    public int getId(){
        return id;
    }
    /**
     *
     * @return name for the teacher
     * */
    public String getName(){
        return name;
    }
    /**
     * Set the salary
     * @param salary
     * */
    public void setSalary(int salary){
        this.salary = salary;
    }
}
