//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static long largestPrimeFactor(int n1) {
        // code here
         long n=(long)n1;
          long max=-1;
		long i=2;
		while(i*i<=n){
		    while(n%i==0){
		        max=i;
		        n=n/i;
		        
		    }
		    i=i+1;
		    
		}
		if(n>1){
		   max=n;
		}
		return max;
    }
}