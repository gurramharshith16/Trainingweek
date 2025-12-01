package week;

public class week10_Program1 {
    public static void main(String[] args) {
        Add add = (a, b) -> a + b;
        System.out.println("Sum = " + add.sum(10, 20));
    }
}

@FunctionalInterface
interface Add {
    int sum(int a, int b);
}
