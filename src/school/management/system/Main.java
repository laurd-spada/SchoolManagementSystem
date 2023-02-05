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
        Teacher daniel = new Teacher(1234,"Daniel", 45_000);
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
    }
}