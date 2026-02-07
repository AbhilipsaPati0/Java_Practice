import java.util.Arrays;
import java.util.Comparator;

// Item class to store weight and value of items
class Item {
    int weight, value;
    
    // Constructor to initialize item
    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class KnapsackSolverSolver { // Changed class name to match new file name

    // 0/1 Knapsack using Dynamic Programming    O(n × capacity)	
    public static int knapsack01(int capacity, int[] weights, int[] values) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][capacity];
    }
    
    // Fractional Knapsack using Greedy Algorithm     O(n log n) (due to sorting)
    public static double fractionalKnapsack(int capacity, Item[] items) {
        Arrays.sort(items, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));
        
        double totalValue = 0;
        for (Item item : items) {
            if (capacity >= item.weight) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += ((double) item.value / item.weight) * capacity;
                break;
            }
        }
        return totalValue;
    }
    
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        
        System.out.println("0/1 Knapsack Maximum profit: " + knapsack01(capacity, weights, values));
        
        Item[] items = {new Item(10, 60), new Item(20, 100), new Item(30, 120)};
        System.out.println("Fractional Knapsack Maximum profit: " + fractionalKnapsack(capacity, items));
    }
}
 