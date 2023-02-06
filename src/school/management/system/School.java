package school.management.system;

import java.util.List;

/**
 Created by King-Spada
 This class is responsible for keeping the track of the school
 teacher, student, total money earned, total money spent on teacher's salary.
The can have many teachers, students
 teacher1, teacher2, teacher3 for example
 student1, student2 ....
 you can create an array to store data
 private Teacher[] teacher = new Teacher[5]
 but array is only for limited no of teachers or students, so we have to use array list.
 **/
public class School {

    private List<Teacher> teachers;
    private List<Students> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * New school object is created
     * @param teachers list of teachers
     * @param students list of students
     * */
    public School(List<Teacher> teachers, List<Students> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
    /**
     * @return the list of teachers in the school
     * */
    public List<Teacher> getTeachers() {
        return teachers;
    }
    /**
     * Add teacher to school
     * @param teacher the teacher to be added.
     * */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }
    /**
     * @return the list of student
     * */
    public List<Students> getStudents() {
        return students;
    }
    /**
     * Add student to school
     * @param student the student to be added.
     * */
    public void addStudents(Students student) {
        students.add(student);
    }
    /**
     *
     * @return the total money earned by the school
     * */
    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    /**
     * Adds the moneyEarned to totalMoneyEarned
     * @param MoneyEarned  money that is added anytime anyone pays
     * */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
    /**
     *
     * @return the total money spent by the school
     * */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    /**
     * update the money that is spent
     * @param  moneySpent the money spent by the school
     * */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
