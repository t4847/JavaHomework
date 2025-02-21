package School;

public class Student {
    //Variables
    private String name;
    private int ID;
    private static int nextID = 100;

    //Constructor
    public Student(final String name, final int ID) {
        this.name = name;
        this.ID = ID;
    }
    public Student(String name) {
        this(name, nextID++);
    }

    //Name Change Methods
    public void changeName(final String newName) {
        this.name = newName;
    }

    //Precedes by ID Method
    public void precedesByID(Student student) {
        if (this.ID > student.ID) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
    //For Printing
    public String toString() {

        return "Student " + name + " with ID " + ID;
    }

}
