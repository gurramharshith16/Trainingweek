package week;
import java.util.*;

public class week10_Program2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}

