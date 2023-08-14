//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
         int result[] = new int[2];
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        while(i<nums.length){
            if(i==nums.length-1){
                result[j] = nums[i];
                break;
            }
            else if(nums[i]==nums[i+1] && i!=nums.length-1){
                i += 2;
            }
            else if(nums[i]!=nums[i+1]){
                result[j] = nums[i];
                j++;
                i++;
            }
        }
       // Arrays.sort(result);
        return result;
    }
}