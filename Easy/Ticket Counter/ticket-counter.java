//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s[]=in.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            Solution ob=new Solution();
            out.println(ob.distributeTicket(n,k));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public static int distributeTicket(int N,int k)
    {
        
        Deque<Integer> pq = new ArrayDeque<>();
        
        for(int i = 1; i <= N; i++){
            pq.add(i);
        }
        
        boolean flag = true;
        int lastOut = -1;
        
        while(!pq.isEmpty()){
            
            if(flag){
                
                int cnt = 0;
                while(cnt++ < k && !pq.isEmpty()){
                    lastOut = pq.removeFirst();
                }
                
                flag = false;
                
            }
            else{
                
                int cnt = 0;
                while(cnt++ < k  && !pq.isEmpty()){
                    lastOut = pq.removeLast();
                }
                
                flag = true;
                
            }
            
        }
        
        return lastOut;
        
    }
}