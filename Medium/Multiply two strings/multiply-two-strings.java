//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
         if(s1.equals("0")||s2.equals("0"))
      {
          return "0";
      }else if(s1=="1")
    {
        return s2;
    }
    else if(s2=="1")
    {
        return s1;
    }
        String ans = new String();
        int countZero=0;
        int k=0;
        boolean negative=false;
        if(s1.charAt(0)=='-') {
            negative=!negative;
            s1=s1.substring(1);
        }
        if(s2.charAt(0)=='-') {
            negative=!negative;
            s2=s2.substring(1);
        }
        while(k<s1.length()-1){ if(s1.charAt(k)=='0') countZero++; else break; k++;}
        s1=s1.substring(countZero);
        k=0;
        countZero=0;
        while(k<s2.length()-1){ if(s2.charAt(k)=='0') countZero++; else break; k++;}
        s2=s2.substring(countZero);
        
        
        int len1 = s1.length();
        int len2 = s2.length();
        int i=len2-1;
        int[] res = new int[len1+len2];
        int pf=0;
        while(i>=0) {
            int b = s2.charAt(i)-'0';
            int carry=0;
            k=res.length-1-pf;
            // for(int j=0;j<i;j++) curr=curr+'0';
            for(int j=len1-1;j>=0;j--) {
                int a = s1.charAt(j)-'0';
                int c = a*b+carry+res[k];
                // curr.append(c%10);
                res[k]=c%10;
                carry=c/10;
                k--;
            }
            if(carry>0) res[k]=carry+res[k];
            pf++;
            // String temp = findSum(ans, curr);
            // ans = temp;
            i--;
        }
        for(int digit : res) {
            ans = ans + digit;
        }
        int count = 0;
        for(i=0;i<ans.length();i++) {
            if(ans.charAt(i)=='0') count++;
            else break;
        }
        ans=ans.substring(count);
        if(negative) return "-"+ans;
        return ans;
    }
    
}
