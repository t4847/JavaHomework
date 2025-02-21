package School;

public class StudentTester {
    public static void main(String[] args) {
        Student bob = new Student("Bob");
        System.out.println(bob);
        bob.changeName("Bobby");
        System.out.println(bob);
        Student josh = new Student("Josh");
        System.out.println(josh);
        josh.precedesByID(bob);
    }
}
