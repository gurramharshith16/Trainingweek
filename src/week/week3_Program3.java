package week;


public class week3_Program3 {
    public static void main(String args[]){
        int n=20;
        long first= 0,second= 1, next;
        System.out.println("Fibonacci series up to 20 numbers");
        for (int i = 1; i<= n; i++) {
            if (i == 1) {
                System.out.print(first + ", ");
                continue;
            }
            if (i == 2) {
                System.out.print(second + ", ");
                continue;
            }
            next = first + second;
            first = second;
            second = next;
            System.out.print(next + ", ");
        }
    }
}
