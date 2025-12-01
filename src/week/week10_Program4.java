package week;
import java.util.*;

public class week10_Program4 {
    public static void main(String[] args) {
        String name = "ChatGPT";
        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println("Is value present? " + optionalName.isPresent());
        System.out.println("Value: " + optionalName.orElse("No value found"));
        optionalName.ifPresent(val -> System.out.println("Uppercase: " + val.toUpperCase()));
    }
}
