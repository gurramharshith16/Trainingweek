package week;

public class week4_Program1 {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String args[]){
        int num=6;
        System.out.println("Factorial of"+num+" is "+factorial(num));
    }
}
