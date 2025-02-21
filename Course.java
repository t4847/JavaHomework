package School;

public class Course {
    private String courseDept;
    private int courseNum;
    private double creditHours;

    public Course(String courseDept, int courseNum, double creditHours) {
        this.courseDept = courseDept;
        this.courseNum = courseNum;
        this.creditHours = creditHours;
    }

    public String toString() {
        return courseDept + " " + courseNum + ", worth " + creditHours + " credits";
    }
}
