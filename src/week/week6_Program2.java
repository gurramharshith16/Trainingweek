package week;

public class week6_Program2 {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        week6_Program2 obj = new week6_Program2();
        System.out.println("Sum of 2 and 3: " + obj.add(2, 3));
        System.out.println("Sum of 1, 2, and 3: " + obj.add(1, 2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + obj.add(2.5, 3.5));
    }
}
