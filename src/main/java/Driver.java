import org.joda.time.DateTime;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // create handful of students
        Student student0 = new Student("Marvin", 21, new DateTime(1999, 12, 22, 0, 0), 1234);
        Student student1 = new Student("Darvin", 20, new DateTime(2000, 11, 21, 0, 0), 4321);
        Student student2 = new Student("Garvin", 19, new DateTime(2001, 10, 20, 0, 0), 5678);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student0);
        students.add(student1);
        students.add(student2);

        // create handful of modules
        Module module0 = new Module("Maths", "MA123");
        Module module1 = new Module("Programming", "CT123");
        Module module2 = new Module("Electronics", "EE123");

        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module0);
        modules.add(module1);
        modules.add(module2);

        // create course
        Course course = new Course("Engineering", new DateTime(2022, 8, 1, 0, 0), new DateTime(2022, 12, 10, 0, 0));

        // add students to a number of modules
        module0.setStudents(students);
        module1.setStudents(students);
        module2.setStudents(students);

        // add modules to a course
        course.setModules(modules);

        // set students course and modules
        // print list of all courses, their modules, their students,
        // their usernames, assigned modules and the courses they are registered for.
        System.out.println(course);
    }
}
