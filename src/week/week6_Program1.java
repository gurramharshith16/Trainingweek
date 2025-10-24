package week;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String studentId;

    Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void displayStudent() {
        display();
        System.out.println("Student ID: " + studentId);
    }
}
public class week6_Program1 {
    public static void main(String[] args) {
        Student s = new Student("Narayana", 20, "S12345");
        s.displayStudent();
    }
}