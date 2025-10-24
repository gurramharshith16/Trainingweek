package week;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    @Override
    void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + bonus);
    }
}

public class week6_Program3 {
    public static void main(String[] args) {
        Employee e = new Employee("Sri", 50000);
        Manager m = new Manager("Sree", 80000, 10000);
        System.out.println("Employee Details:");
        e.displayInfo();
        System.out.println("\nManager Details (Overridden Method):");
        m.displayInfo();
        Employee ref = new Manager("Narayana", 90000, 12000);
        System.out.println("\nUsing Polymorphism:");
        ref.displayInfo();
    }
}