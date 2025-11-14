package week;

import java.util.HashMap;
import java.util.Map;

public class week9_Program3 {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Alan");
        studentMap.put(2, "Bobby");
        studentMap.put(3, "Charu");
        System.out.println("Roll Number to Name Mapping:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}