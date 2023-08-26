//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
          int maxLen = -1;
        HashMap<Character,Integer>hmp = new HashMap<>();
        int i=0,j=0;
        int n=s.length();
        while(j<n){
            hmp.compute(s.charAt(j),(key,value)->value==null?1:value+1);
            while(hmp.size()>k){
                hmp.compute(s.charAt(i),(key,value)->value==1?null:value-1);
                i++;
            }
            if(hmp.size()==k)
                maxLen = Math.max(j-i+1,maxLen);
            j++;
        }
        return maxLen;
    }
}