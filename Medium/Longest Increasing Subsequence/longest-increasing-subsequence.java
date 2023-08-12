//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
     static int longestSubsequence(int size, int a[])
    {
           ArrayList<Integer> piles = new ArrayList<>();
    for (int num : a) {
        int pileIdx = Collections.binarySearch(piles, num);
        if (pileIdx < 0) {
            pileIdx = -(pileIdx + 1);
            if (pileIdx == piles.size()) {
                piles.add(num);
            } else {
                piles.set(pileIdx, num);
            }
        }
    }
    return piles.size();
    }


} 