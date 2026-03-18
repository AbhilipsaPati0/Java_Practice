// LCS un java 
//by  Abhilipsa 

public class LCS {
    
    // Function to find the Longest Common Subsequence (LCS)
    public static String findLCS(String X, String Y) {
        int m = X.length(), n = Y.length();
        int[][] dp = new int[m + 1][n + 1]; // DP table to store LCS lengths

        // 1: Fill the DP table using Bottom-Up approach
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) { 
                    // If characters match, increase LCS length from diagonal cell
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // If characters don’t match, take the max from top or left cell
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // 2: Backtracking to find the LCS sequence
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        
        while (i > 0 && j > 0) {
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                // If characters match, add to LCS and move diagonally up-left
                lcs.append(X.charAt(i - 1)).append(" ");
                i--; 
                j--;  
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                // If the top cell has a greater value, move up
                i--;
            } else {
                // Otherwise, move left
                j--;
            }
        }

        // Reverse the LCS sequence since we built it backwards
        return lcs.reverse().toString().trim();
    }

    public static void main(String[] args) {
        // Given input sequences
        String X = "ABCBDAB";
        String Y = "BDCABA";

        // Call the LCS function
        String lcs = findLCS(X, Y);
        
        // Print the LCS length (excluding spaces) and the LCS sequence
        System.out.println("Length of LCS: " + lcs.replace(" ", "").length());
        System.out.println("LCS Sequence: " + lcs);
    }
}
