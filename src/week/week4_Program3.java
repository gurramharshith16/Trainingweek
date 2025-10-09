package week;

public class week4_Program3 {
    public static void reversearray(int[] array){
        int start=0;
        int end=array.length-1;

        while (start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 13, 4, 5};
        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        reversearray(arr);
        System.out.println("\nReversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
