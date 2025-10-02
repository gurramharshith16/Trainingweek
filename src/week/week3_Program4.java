package week;
import java.util.*;
public class week3_Program4 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1= scanner.nextDouble();
        double num2= scanner.nextDouble();

        System.out.println("Choose the operation");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiply\n4.Division");

        int choice= scanner.nextInt();;
        switch(choice){
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
