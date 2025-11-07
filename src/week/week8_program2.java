package week;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class week8_program2 {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 90) {
            throw new InvalidAgeException("Invalid age entered! Age must be between 18 and 90.");
        } else {
            System.out.println("Valid age entered: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Age validation Process complete");
        }
    }
}
