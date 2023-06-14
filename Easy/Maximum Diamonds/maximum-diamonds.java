//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);
            
            int[] A = new int[N];
            
            String S1[] = read.readLine().split(" ");
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxDiamonds(A,N,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long maxDiamonds(int[] arr, int N, int k) {
        // code here
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N;i++){
            pq.add(arr[i]);
        }
        long ans=0;
        while(k-->0){
            int ele=pq.remove();
            ans+=ele;
            pq.add(ele/2);
        }
        return ans;
    }
}