package Zabawa.OOP;

public class Constructors {
    public static void main(String[] args) {
        // Method to initialize objects with unique values.
        Student student1 = new Student("Borno", 21, 3.5);
        Student student2 = new Student("Marcin", 21, 3.2);
        Student student3 = new Student("Zgerman", 33, 5.0);

        //System.out.println(student1.name + "\n" + student1.age + "\n" + student1.gpa + "\n" + student1.isEnrolled + "\n");
        //System.out.println(student2.name + "\n" + student2.age + "\n" + student2.gpa + "\n" + student2.isEnrolled + "\n");
        //System.out.println(student3.name + "\n" + student3.age + "\n" + student3.gpa + "\n" + student3.isEnrolled + "\n");

        student1.study();
        student2.study();
        student3.study();
    }
}
