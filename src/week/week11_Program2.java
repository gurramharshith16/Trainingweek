package week;
import java.io.FileWriter;
import java.util.Scanner;

public class week11_Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("output.txt")) {
            System.out.println("Enter text to write into file:");
            String data = sc.nextLine();
            fw.write(data);
            System.out.println("Data written to output.txt");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
