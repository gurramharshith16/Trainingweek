package week;
import java.util.HashSet;

public class week9_Program2 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); //Duplicate one
        System.out.println("Unique Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}