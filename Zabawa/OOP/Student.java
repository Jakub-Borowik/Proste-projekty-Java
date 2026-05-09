package Zabawa.OOP;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // This refersa to the object we are currently working with/constructing
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }
    void study(){
        System.out.println(this.name + " is studying");
    }
}
