package week;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class week11_Program1 {
    public static void main(String[] args) {
        String fileName = "input.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
