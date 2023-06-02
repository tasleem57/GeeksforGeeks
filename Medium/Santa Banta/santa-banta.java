//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
    
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
	    Complete obj = new Complete();
		obj.precompute();    	
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int M = Integer.parseInt(element[1]);
		    int arr [][] = new int[M][2];
		    for(int i = 0;i<M;i++){
	            line = br.readLine();
		        String[] elements = line.trim().split("\\s+");
		        arr[i][0] = Integer.parseInt(elements[0]);
		        arr[i][1] = Integer.parseInt(elements[1]);    
	        }
            int ans = obj.helpSanta(N, M, arr);
            System.out.println(ans);
    	    
		}
	}
}




// } Driver Code Ends


//User function Template for Java


class Complete{
    //static int[] primeList = new int[1299722];

    static class DSU{
        int[] parent;
        int[] size;
        public DSU(int n){
            parent = new int[n+1];
            size = new int[n+1];
            for(int i=0;i<n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }
        
        public int findParent(int x){
            if(parent[x]!=x)
                parent[x] = findParent(parent[x]);
            return parent[x];
        }
        
        public void union(int a, int b){
            int parentA = findParent(a);
            int parentB = findParent(b);
            
            if(parentA==parentB)
                return;
            if(size[parentA]>size[parentB]){
                parent[parentB]=parentA;
                size[parentA]+=size[parentB];
            }
            else{
                parent[parentA]=parentB;
                size[parentB]+=size[parentA];
            }
        } 
        
    }
    
    private static List<Integer> primes;

    public static void precompute() {
        boolean[] isPrime = new boolean[(int) (1e6 + 1)];
        primes = new ArrayList<>();

        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i < (int)(Math.sqrt(isPrime.length)); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
    }
    
    // Function for finding maximum and value pair
    public static int helpSanta (int n, int m, int g[][]) {

        //Complete the function
        if(n == 0 || m == 0) return -1;
        int max=1;
        DSU dsu = new DSU(n);
        for(int[] connection: g){
            dsu.union(connection[0],connection[1]);
        }
        
        for(int i=0;i<n;i++){
            max=Math.max(max, dsu.size[i]);
        }
        
        //System.out.println(max);
        
        return max==1? -1: primes.get(max-1);
    }
    
    
}