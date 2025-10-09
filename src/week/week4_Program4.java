package week;

public class week4_Program4 {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return index of found element
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 1};
        int target = 4; // Element to search for

        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
