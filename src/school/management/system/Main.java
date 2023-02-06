package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 Created by King-Spada
 This class is responsible for keeping the track of teachers.
 names, id, salary.

 **/
public class Main {
    public static void main(String[] args) {
        Teacher daniel = new Teacher(1234,"Daniel Obo", 45_000);
        Teacher joy = new Teacher(4234,"joy", 35_000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(daniel);
        teacherList.add(joy);

        Students davina = new Students(1, "davina dada", 10);
        Students regina = new Students(2, "regina daniels", 5);
        Students harnony = new Students(3, "harnony lawv", 15);

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(davina);
        studentsList.add(regina);
        studentsList.add(harnony);

        School upss = new School(teacherList, studentsList);

        //Just for adding new teacher by addMethod
        Teacher kiran = new Teacher(464, "Kiran Marry", 15_000);
        upss.addTeachers(kiran);

        Students Ada = new Students(4, "Ada ann", 10);
        upss.addStudents(Ada);

        regina.payFees(5000);
        harnony.payFees(25000);
        System.out.println("---------\t\tupss fund earning: " + upss.getTotalMoneyEarned() + "\t\t--------");

        System.out.println("-------------\t\t UPSS pays salary \t\t ---------");

        daniel.receiveSalary(daniel.getSalary());
        System.out.println("UPSS spent salary : " + daniel.getName() + " Remaining Money is " + School.getTotalMoneyEarned());
        joy.receiveSalary(joy.getSalary());
        System.out.println("UPSS spent salary : " + joy.getName() + " Remaining Money is " + School.getTotalMoneyEarned());

        System.out.println("----------------------------");
        System.out.println(davina);
        System.out.println(regina);
        System.out.println(harnony);
        System.out.println(Ada);
        System.out.println("----------------------------");
        System.out.println(daniel);
        System.out.println(joy);
        System.out.println(kiran);

    }
}