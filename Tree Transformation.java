class Solution 
{
    public static int solve(int N, int[] p) 
    {
        int [] a = new int[N + 1];
        for (int i = 1; i < N; i++) 
        {
            a[p[i]]++;
            a[i]++;
        }
        int sum = 0;
        for (int i = 0; i < N; i++)
            if (a[i] == 1)
                sum++;
        return Math.max(N - sum - 1,0);
    }
}
