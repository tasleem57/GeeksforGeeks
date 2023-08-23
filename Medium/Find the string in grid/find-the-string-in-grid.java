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
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            int[][] ans = obj.searchWord(grid, word);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            if(ans.length==0)
            {
                System.out.println("-1");
            }

        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {
        // Code here

        int n = grid.length;
        int m = grid[0].length;
        List<int[]> result = new ArrayList<>();
        
        // Define the eight possible directions: up, down, left, right, and four diagonals
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        // Iterate through each cell in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Check if the current cell matches the first character of the word
                if (grid[i][j] == word.charAt(0)) {
                    // Check all eight directions from the current cell
                    for (int dir = 0; dir < 8; dir++) {
                        int x = i + dx[dir];
                        int y = j + dy[dir];
                        int k = 1;
                        
                        // Check if the remaining characters of the word match in the current direction
                        while (k < word.length() && x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == word.charAt(k)) {
                            x += dx[dir];
                            y += dy[dir];
                            k++;
                        }
                        
                        // If the entire word was found, add the starting cell to the result list
                        if (k == word.length()) {
                            result.add(new int[]{i, j});
                            break;  // Break out of the loop as we found a match in this direction
                        }
                    }
                }
            }
        }
        
        // Convert the list of results to a 2D array and return
        int[][] ans = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
