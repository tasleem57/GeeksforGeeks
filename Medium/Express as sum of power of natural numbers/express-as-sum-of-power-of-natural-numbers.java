//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int n = Integer.parseInt(input[0]); 
            int x = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.numOfWays(n, x));
        }
    }
}

// } Driver Code Ends


class Solution
{
    static int helper(int[][] dp, int n, int i, int x) {
		if (Math.pow(i, x) > n)
			return 0;
		if (Math.pow(i, x) == n)
			return 1;
		if (dp[i][n] != -1)
			return dp[i][n];
		int pick = helper(dp, n - (int) Math.pow(i, x), i + 1, x);
		int notPick = helper(dp, n, i + 1, x);
		return dp[i][n] = (pick % 1000000007 + notPick % 1000000007) % 1000000007;
	}

	static int numOfWays(int n, int x) {
		// code here
		int[][] dp = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++)
				dp[i][j] = -1;
		}
		return helper(dp, n, 1, x);
	}
}