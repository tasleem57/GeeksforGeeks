//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        int count5 = 0;
        int count10 = 0;
        // code here
        for(int i=0; i<N; i++){
            if(bills[i] == 5){
                count5++;
            }
            if(bills[i] == 10){
                if(count5 > 0){
                    count5--;
                    count10++;
                    continue;
                } else {
                    return false;
                }
            }
            if(bills[i] == 20){
                if (count5>=3 && count10==0){
                    count5 = count5-3;
                } else if(count5>0 && count10>0){
                    count5--;
                    count10--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
