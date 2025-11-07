package week;

public class week8_program3 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block.");
            int data = 10 / 0;
            System.out.println("This line will not execute.");
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes, even if an exception occurs.");
        }
        System.out.println("Program continues after try-catch-finally.");
    }
}
