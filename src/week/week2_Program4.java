package week;

public class week2_Program4 {
    public static void main(String args[]){
        int a=12;
        int b=13;

        System.out.println("before swap:a="+a+",b= "+b);

        a =a+b;
        b =b+a;
        a =a-b;

        System.out.println("After swap:a="+a+",b= "+b);
    }

}
