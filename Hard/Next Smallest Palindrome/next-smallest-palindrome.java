//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int num[] = new int[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(str[i]);
            }

            Vector<Integer> ans = new Solution().generateNextPalindrome(num, n);
            for (Integer x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {

    Vector<Integer> generateNextPalindrome(int num[], int n) {
        // code here
int i=(n-1)/2;
        int j=n/2;
        boolean in=isnine(num);
        if(in){
              Vector<Integer> v = new Vector<Integer>(n+1);
        for(int k=0;k<n+1;k++){
            if(k==0 ||k==n){
                v.add(1);
            }else{
            v.add(0);
        }}
        return v;
        }
        boolean flag=is(num);

        while(i>=0){
        if(flag){
             if(num[i]==9){
                 num[i]=0;
                 flag=true;
             }
             else{
                 num[i]++;
                 flag=false;
             }
        }
        num[j++]=num[i--];
        }
        Vector<Integer> v = new Vector<Integer>(n);
        for(int k=0;k<n;k++){
            v.add(num[k]);
        }
        return v;
    }
  public boolean is(int []num){
      int n=num.length;
      int i=(n-1)/2;
      int j=(n)/2;
      while(i>=0){
           if(num[i]<num[j]){
               return true;
           }
        else if(num[i] > num[j]) {return false;}
           i--;
           j++;
      }
      return true;
  }
  public boolean isnine(int []num){
        for(int i=0;i<num.length;i++){
            if(num[i]!=9){
                return false;
            }
        }
        return true;
    }
}