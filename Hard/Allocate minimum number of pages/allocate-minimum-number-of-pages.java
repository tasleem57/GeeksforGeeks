//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(N<M){
            return -1;
        }
        int tp=Arrays.stream(A).sum();
        int mp1=Arrays.stream(A).max().getAsInt();
        int mp=tp;
        while(mp1<mp){
            int midp=(mp1+mp)/2;
            if(isValidAllocation(A,N,M,midp)){
                mp=midp;
            }else {
                mp1=midp+1;
            }
        }
        return mp1;
    }
    private static boolean isValidAllocation(int[] A,int N,int M,int mp){
        int students=1;
        int pr=0;
        for(int i=0;i<N;i++){
            if(A[i]>mp){
                return false;
            }
            if(pr+A[i]>mp){
                students++;
                pr=A[i];
                if(students>M){
                    return false;
                }
            }else{
                pr+=A[i];
            }
        }
        return true;
    }
};