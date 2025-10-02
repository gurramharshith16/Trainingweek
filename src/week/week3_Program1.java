package week;
import java.util.Scanner;


public class week3_Program1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num= scan.nextInt();

        if(num%2==0){
            System.out.println("It is a even number");
        }else{
            System.out.println("It is a odd number");
        }

    }
}
