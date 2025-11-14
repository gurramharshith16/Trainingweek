package week;

import java.util.ArrayList;
import java.util.Iterator;

public class week9_Program4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
