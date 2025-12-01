package week;
import java.io.BufferedReader;
import java.io.FileReader;

public class week11_Program3 {
    public static void main(String[] args) {
        String filename = "input.txt";
        int lineCount = 0;
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                wordCount += line.split("\\s+").length;
            }
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}