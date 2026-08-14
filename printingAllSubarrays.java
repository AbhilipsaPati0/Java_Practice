import java.util.*;

public class printingAllSubarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // PRINTING ALL SUBARRAYS

        // System.out.println("All subarrays are:");
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         for (int k = i; k <= j; k++) {
        //             System.out.print(arr[k] + " ");
        //         }
        //         System.out.println();
        //     }
        // }



       
        // SUM OF ALL SUBARRAYS

        // System.out.println("Sum of all subarrays:");

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i; j < arr.length; j++) {

        //         int sum = 0;

        //         for (int k = i; k <= j; k++) {
        //             sum = sum + arr[k];
        //         }

        //         System.out.println(sum);
        //     }
        // }


       
        // MAXIMUM SUM SUBARRAY
        
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];

                if (sum > maxSum) {
                    maxSum = sum; 
                }
            }
        }
        System.out.println("Maximum sum of subarray: " + maxSum);

        sc.close();
    }
}