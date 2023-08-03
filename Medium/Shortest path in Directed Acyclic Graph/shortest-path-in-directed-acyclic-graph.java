//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


class Solution {

	public int[] shortestPath(int N,int M, int[][] edges) {
		ArrayList<ArrayList<int[]>>  adj=new ArrayList<>();
		
		for(int i=0;i<N;i++){
		    adj.add(new ArrayList<>());
		}
		for(int[] e:edges){
		    adj.get(e[0]).add(new int[]{e[1],e[2]});
		}
		
		int[] dist=new int[N];
		Arrays.fill(dist,-1);
		dist[0]=0;
	    Queue<Pair> q=new LinkedList<>();
	    q.offer(new Pair(0,0));
	    while(!q.isEmpty()){
	        Pair curr=q.poll();
	        int parent=curr.vertex;
	        int amount=curr.cost;
	        for(int[] it:adj.get(parent)){
	            int child=it[0];
	            int amount2=it[1];
	            if(dist[child]==-1 || amount+amount2<dist[child]){
	                dist[child]=amount2+amount;
	                q.offer(new Pair(child,dist[child]));
	            }   
	        }
	    }
	    return dist;
	}
	class Pair{
	    int vertex,cost;
	    Pair(int vertex,int cost){
	        this.vertex=vertex;
	        this.cost=cost;
	    }
	}
}