//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
            int n=Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            Node head=new Node(Integer.parseInt(s[0]));
            Node copy=head;
            for(int i=1;i<n;i++){
                Node temp=new Node(Integer.parseInt(s[i]));
                copy.next=temp;
                copy=copy.next;
            }
            Solution ob=new Solution();
            Node ans=ob.modifyTheList(head);
            while(ans!=null){
                out.print(ans.data+" ");
                ans=ans.next;
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    static int count;
    static Node root;
    static Node call(Node temp){
        if(temp.next == null){
            return temp;
        }
        Node nVal = call(temp.next);
        if(count>0 ){
            int mom = nVal.data;
            nVal.data = root.data;
            root.data = mom - root.data;
            count--;
            root = root.next;
        }
        return temp;
    }
    public static Node modifyTheList(Node head)
    {
        Node temp = head;
        int size =0;
        while(temp!= null){
            size++;
            temp = temp.next;
        }
        if(size == 1)return head;
        temp = head;
        root = head;
        count = size/2;
        call(temp);
        return head;
        
    }
    
}