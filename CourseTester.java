package School;

public class CourseTester {
    public static void main(String[] args) {
        Course programming155 = new Course("CMSC",150, 4);
        System.out.println(programming155);
        CG_Course cgCourse = new CG_Course("CMSC", 155, 4, "Right here, right now");
        System.out.println(cgCourse);


        Course x = programming155;
        Course y = cgCourse;

    }
}
