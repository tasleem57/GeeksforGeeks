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
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{

    static int nextHappy(int N){
        // code here
        int i;
        for(i=N+1; ; i++)
        {
            if(isHappy(i))
            break;
        }
        return i;
    }
    
    static boolean isHappy(int n)
    {
        if(n==1 || n==7)
        return true;
        else if(n<10)
        return false;
        
        int sum = 0;
        while(n>0)
        {
            int digit = n%10;
            sum += digit*digit;
            n = n/10;
        }
        return isHappy(sum);
    }
}