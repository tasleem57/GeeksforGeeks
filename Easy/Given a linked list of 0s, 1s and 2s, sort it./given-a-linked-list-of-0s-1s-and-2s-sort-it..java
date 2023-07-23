//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
            int c0 = 0, c1 = 0, c2 = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == 0){
                c0++;
            } else if(temp.data == 1){
                c1++;
            } else {
                c2++;
            }
            temp = temp.next;
        }
        temp = null;
        for(int i=0; i<c0; i++){
            Node a = new Node(0);
            if(temp == null){
                temp = a; 
                head = temp;
            }
            else {
                temp.next = a;
                temp = temp.next;
            }
        }
        for(int i=c0; i<c0+c1; i++){
            Node a = new Node(1);
            if(temp == null){
                temp = a;
                head = temp;
            }
            else {
                temp.next = a;
                temp = temp.next;
            }
        }
        for(int i=c0+c1; i<c0+c1+c2; i++){
            Node a = new Node(2);
            if(temp == null){
                temp = a; 
                head = temp;
            }
            else {
                temp.next = a;
                temp = temp.next;
            }
        }
        return head;
    }

}


