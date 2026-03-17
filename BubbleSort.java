// Bubble Sort implementation in Java
// Time Complexity: O(n^2) in the worst and average case, O(n) in the best case (when the array is already sorted)
// by Abhilipsa Pati
public class BubbleSort {
    // Function to implement Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }
    }
    
    // Main method to test the sorting function
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Unsorted Array:");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("Sorted Array:");
        printArray(arr);
    }
    
    // Utility function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
