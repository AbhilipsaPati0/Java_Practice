import java.util.Arrays;

public class ArrayInsertionDeletion {
    
    // Function to insert an element at a specific position in an array
    public static int[] insertElement(int[] arr, int element, int position) {
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position");
            return arr;
        }
        
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }
    
    // Function to delete an element from a specific position in an array
    public static int[] deleteElement(int[] arr, int position) {
        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid position");
            return arr;
        }
        
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == position) {
                continue;
            }
            newArr[j++] = arr[i];
        }
        return newArr;
    }
    
    // Main method to test insertion and deletion
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        // Insert element
        arr = insertElement(arr, 25, 2);
        System.out.println("Array after insertion: " + Arrays.toString(arr));
        
        // Delete element
        arr = deleteElement(arr, 3);
        System.out.println("Array after deletion: " + Arrays.toString(arr));
    }
}
