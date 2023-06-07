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
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.leastPrimeFactor(n);
            for(int i = 1; i <=n; i++)
            {
                out.print(ans[i] + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] leastPrimeFactor(int n)
    {
        // code here
        int[] primes = new int[n + 1];
        primes[1] = 1;  // Special case for 1

        // Mark all numbers greater than 1 as potential primes
        for (int i = 2; i <= n; i++) {
            if (primes[i] == 0) {  // Found a potential prime
                primes[i] = i;  // The least prime factor of i is i itself

                // Mark multiples of i as non-prime
                for (int j = i * i; j <= n; j += i) {
                    if (primes[j] == 0) {  // Only update if not previously marked
                        primes[j] = i;
                    }
                }
            }
        }

        return primes;
    }
}