import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* PERSON INPUT AND OUTPUT */

        System.out.println("-- Person class --");

        System.out.print("Enter person's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter person's address: ");
        String address = scanner.nextLine();

        Person person = new Person(name, address);
        System.out.println(person);

        System.out.println();

        /* STUDENT INPUT AND OUTPUT */

        System.out.println("-- Student class --");

        System.out.print("Enter student's name: ");
        name = scanner.nextLine();

        System.out.print("Enter student's address: ");
        address = scanner.nextLine();

        Student student = new Student(name, address);

        System.out.print("Enter number of courses: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course name: ");
            String course = scanner.nextLine();

            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine();

            student.addCourseGrade(course, grade);
        }

        student.printGrades();
        System.out.println("Average grade: " + student.getAverageGrade());
        System.out.println(student);

        System.out.println();

        /* TEACHER INPUT AND OUTPUT */

        System.out.println("-- Teacher class --");

        System.out.print("Enter teacher's name: ");
        name = scanner.nextLine();

        System.out.print("Enter teacher's address: ");
        address = scanner.nextLine();

        Teacher teacher = new Teacher(name, address);

        System.out.print("Enter number of courses: ");
        numCourses = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course name: ");
            String course = scanner.nextLine();

            if (teacher.addCourse(course))
                System.out.println("Course added");
            else
                System.out.println("Course already exists or limit reached");
        }

        System.out.print("Enter course to remove: ");
        String course = scanner.nextLine();

        if (teacher.removeCourse(course))
            System.out.println("Course removed");
        else
            System.out.println("Course not found");

        System.out.println(teacher);
    }
}