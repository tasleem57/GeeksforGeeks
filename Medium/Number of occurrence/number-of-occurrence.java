//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    int BS(int arr[],int n,int x,boolean isFirst){
        int low = 0,high = n-1,mid,ans=-1;
        
        while(low<=high){
            mid = (low + high)/2;
            
            if(arr[mid]==x){
                ans = mid;
                if(isFirst) high = mid-1;
                else        low = mid+1;
            }
            else if(arr[mid]<x) low = mid+1;
            else                high = mid-1;
            
        }
        
        return ans;
    }
    
    
    int count(int[] arr, int n, int x) {
        int first = BS(arr,n,x,true);
        if(first==-1)   return 0;
        
        return BS(arr,n,x,false) - first + 1;
    }
}