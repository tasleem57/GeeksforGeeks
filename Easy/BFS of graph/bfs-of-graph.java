//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        
        //ArrayList to store and return the result
        ArrayList<Integer> res = new ArrayList<>();
        
        //queue to store the traversed list
        Queue<Integer> queue = new LinkedList<>();
        
        //add 0 as it is the source node of traversal in the graph
        res.add(0);
        queue.add(0);
        
        //while the queue is not empty
        while(!queue.isEmpty()){
            
            //remove the front element from the queue
            int front = queue.remove();
            
            //run the loop till the size of front'th row in adj arraylist
            for(int j=0; j<adj.get(front).size(); j++){
                
                //if the particular element is no present in the res, then add it in queue and res and continue
                if(!res.contains(adj.get(front).get(j))){
                    queue.add(adj.get(front).get(j));
                    res.add(adj.get(front).get(j));
                }
            }
        }
        
        //return the res
        return res;
    }
}