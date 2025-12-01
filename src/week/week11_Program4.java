package week;
import java.io.FileReader;
import java.io.FileWriter;

public class week11_Program4 {
    public static void main(String[] args) {
        String source = "input.txt";
        String destination = "copy.txt";
        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(destination)) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            System.out.println("File copied successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

