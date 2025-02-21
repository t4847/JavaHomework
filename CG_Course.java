package School;

public class CG_Course extends Course{
    private String location;

    public CG_Course(String courseDept, int courseNum, double creditHours, String location) {
        super (courseDept, courseNum, creditHours);
        this.location = location;
    }

    public String toString() {
        return super.toString() + ", " + location;
    }
}
