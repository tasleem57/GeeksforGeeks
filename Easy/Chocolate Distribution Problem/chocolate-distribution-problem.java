//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        if(m>n)
            return -1;
        if(n==0 || m==0){
            return 0;
        }
        
        Collections.sort(a);
        long min_diff=Integer.MAX_VALUE;
        
        for(int i=0;i+m-1<n;i++){
            long diff=a.get(i+m-1)-a.get(i);
            if(diff<min_diff){
                min_diff=diff;
            }
        }
        
        return min_diff;
    }
}