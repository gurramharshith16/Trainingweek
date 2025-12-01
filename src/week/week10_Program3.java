package week;
import java.util.*;

public class week10_Program3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfSquares = nums.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Sum of squares = " + sumOfSquares);
    }
}
