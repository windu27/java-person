/**
 * Represents a student, which is a subclass of the Person class.
 */
public class Student extends Person {
    private final int MAX_COURSES = 10;

    private int numCourses;
    private String[] courses;
    private int[] grades;

    /**
     * Constructs a Student object with the specified name and address.
     * 
     * @param name    the name of the student
     * @param address the address of the student
     */
    public Student(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[MAX_COURSES];
        this.grades = new int[MAX_COURSES];
    }

    /**
     * Adds a course and its corresponding grade to the student's record.
     * 
     * @param course the name of the course
     * @param grade  the grade obtained in the course
     */
    public void addCourseGrade(String course, int grade) {
        if (this.numCourses >= MAX_COURSES) {
            System.out.println("Cannot add more courses");
            return;
        }
        this.courses[this.numCourses] = course;
        this.grades[this.numCourses] = grade;
        this.numCourses++;
    }

    /**
     * Prints the grades of all the courses taken by the student.
     */
    public void printGrades() {
        for (int i = 0; i < this.numCourses; i++) {
            System.out.println(this.courses[i] + ": " + this.grades[i]);
        }
    }

    /**
     * Calculates and returns the average grade of the student.
     * 
     * @return the average grade of the student
     */
    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < this.numCourses; i++)
            sum += this.grades[i];
        return sum / this.numCourses;
    }

    /**
     * Returns a string representation of the Student object.
     * 
     * @return a string representation of the Student object
     */
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}