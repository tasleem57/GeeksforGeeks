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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
         int start=0,end=0,len=0,n=S.length();
        for(int i=1;i<n;i++){
            int s=i-1,e=i+1;
            while(s>=0 && e<n && S.charAt(s)==S.charAt(e)){
                if(e-s+1>len){
                    len=e-s+1;
                    start=s;
                    end=e;
                }
                s--;
                e++;
            }
            s=i-1;
            e=i;
            while(s>=0 && e<n && S.charAt(s)==S.charAt(e)){
                if(e-s+1>len){
                    len=e-s+1;
                    start=s;
                    end=e;
                }
                s--;
                e++;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=start;i<=end;i++)ans.append(S.charAt(i));
        return ans.toString();
        
    }
}