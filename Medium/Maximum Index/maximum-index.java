//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    int maxIndexDiff(int arr[], int n) {
        int[] left=new int[n];
        int[] right=new int[n];
        
        left[0]=arr[0];
        right[n-1]=arr[n-1];
        
        for(int i=1;i<n;i++){
            left[i]=Math.min(arr[i],left[i-1]);
        }
        
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);
        }
        
        int res=0;
        
        int i=0;
        int j=0;
        
        while(j<n){
            if(left[i]<=right[j]){
                res=Math.max(res,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        
        return res;
        
    }
}