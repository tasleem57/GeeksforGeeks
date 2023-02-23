class Solution {
  public:
    int uniquePaths(int n, int m, vector<vector<int>> &grid) {
       int MOD = 1e9 + 7;
       if(grid[0][0] == 0 || grid[n - 1][m - 1] == 0) return 0;

        vector<vector<int>> dp(n + 1, vector<int>(m + 1, 0));

        dp[1][1] = 1;

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= m; j++){

                if(grid[i - 1][j - 1] == 0) continue;

                dp[i][j] += dp[i - 1][j] + dp[i][j - 1];

                dp[i][j] %= MOD;

            }

        }

        return dp[n][m] % MOD;
    }
};
