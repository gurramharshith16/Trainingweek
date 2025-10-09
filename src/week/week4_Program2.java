package week;

public class week4_Program2 {
    public static int maxofThree(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }
    public static void main(String[] args) {
        int x = 10, y = 20, z = 30; // Example numbers
        System.out.println("The maximum of " + x + ", " + y + " and " + z + " is " + maxofThree(x, y, z));
    }
}
