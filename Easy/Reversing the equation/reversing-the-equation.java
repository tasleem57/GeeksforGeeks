//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
        Stack<String>stack=new Stack<>();
                int sujan=0 ,sufii=S.length();
        while(sujan<sufii){
            String s="";
            while(sujan<sufii && S.charAt(sujan)>='0' && S.charAt(sujan)<='9'){
            s+=S.charAt(sujan);
            sujan++;
        }
        stack.push(s);
        if(sujan<sufii){
            stack.push(S.charAt(sujan)+"");
            sujan++;
        }
    }
    StringBuilder sb=new StringBuilder("");
    while(!stack.isEmpty())
    sb.append(stack.pop());
    return sb.toString();
    }
    

}