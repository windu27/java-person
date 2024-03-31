
/**
 * The Teacher class represents a teacher, which is a subclass of the Person
 * class.
 * It contains methods to add and remove courses for the teacher.
 */
public class Teacher extends Person {
    private final int MAX_COURSES = 10;

    private int numCourses;
    private String[] courses;

    /**
     * Constructs a Teacher object with the specified name and address.
     * Initializes the number of courses to 0 and creates an array to store the
     * courses.
     *
     * @param name    the name of the teacher
     * @param address the address of the teacher
     */
    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[MAX_COURSES];
    }

    /**
     * Adds a course to the teacher's list of courses.
     *
     * @param course the course to be added
     * @return true if the course was added successfully, false if the course
     *         already exists
     */
    public boolean addCourse(String course) {
        if (this.numCourses >= MAX_COURSES)
            return false;

        for (int i = 0; i < this.numCourses; i++) {
            if (this.courses[i].equals(course)) {
                return false;
            }
        }
        this.courses[this.numCourses] = course;
        this.numCourses++;
        return true;
    }

    /**
     * Removes a course from the teacher's list of courses.
     *
     * @param course the course to be removed
     * @return true if the course was removed successfully, false if the course does
     *         not exist
     */
    public boolean removeCourse(String course) {
        for (int i = 0; i < this.numCourses; i++) {
            if (this.courses[i].equals(course)) {
                for (int j = i; j < this.numCourses - 1; j++) {
                    this.courses[j] = this.courses[j + 1];
                }
                this.numCourses--;
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a string representation of the Teacher object.
     *
     * @return a string representation of the Teacher object
     */
    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
}