package Zabawa;

public class Super {
    public static void main(String[] args) {
        // Also known as the parent class (Superclass), calls the parent constructor to initialize attributes
        Person person = new Person("Jakub", "Borno");
        Student student = new Student("Patryk", "Muala", 4.0);
        Employee employee = new Employee("Max", "Paua", 4560);
        person.showName();
        student.showName();
        student.showGPA();
        employee.showSalary();
    }
}
