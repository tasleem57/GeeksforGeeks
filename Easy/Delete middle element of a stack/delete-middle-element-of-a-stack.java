//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    //Function to delete middle element of a stack.
    void rec(Stack<Integer> s, int n)
    {
        int a= s.pop();
        if(n==0)//if mid then just return without pushing
        {
            return;
        }
        else
        {
           rec(s, n-1);//going to mid from back
           s.push(a);//if not mid then pushing while coming back in recursion
        }
    }
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        rec(s, sizeOfStack-(sizeOfStack+1)/2);//going to mid from back
    } 
}
