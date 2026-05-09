package Zabawa;

public class Student extends Person {
    double gpa;

    Student(String firstName, String lastName, double gpa){
        // Super keyword passess the attributes needed by the parent class
        super(firstName, lastName);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.firstName + " " + this.lastName + "s' gpa is: " + this.gpa);
    }
}
