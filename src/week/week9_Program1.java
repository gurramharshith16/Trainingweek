package week;

import java.util.*;

class ClassStudents {
    int rollNo;
    String name;
    ClassStudents(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}
public class week9_Program1 {
    public static void main(String[] args) {
        ArrayList<ClassStudents> students = new ArrayList<>();
        students.add(new ClassStudents(1, "Alankar"));
        students.add(new ClassStudents(2, "Babu"));
        students.add(new ClassStudents(3, "Charlie"));
        System.out.println("Student Details:");
        for (ClassStudents s : students) {
            s.display();
        }
    }
}
