//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends

class Solution {
    public long count(int coins[], int N, int sum) {
        // code here.
         long dp[] = new long [sum+1];
         dp[0] = 1 ;
       
       for(int i = 0 ; i < coins.length ; i++){
           for(int j = coins[i] ;  j < dp.length ; j++){
               dp[j] += dp[j - coins[i]] ;
           }
       }
       return dp[sum];
    }
}