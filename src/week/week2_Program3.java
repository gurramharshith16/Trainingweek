package week;
import java.util.*;

public class week2_Program3 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the principle amount(P): ");
        double p=scanner.nextDouble();
        System.out.println("Enter the time given (T): ");
        double t= scanner.nextDouble();
        System.out.println("Enter the rate of interest(R): ");
        double r= scanner.nextDouble();

        double simpleInterest=(p*t*r)/100;
        System.out.println("SimpleInterest is: "+simpleInterest);

    }
}
