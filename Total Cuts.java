class Solution {
    public static int totalCuts(int N, int K, int[] A) {
        // code here
int cuts = 0;
    int maxLeft = A[0];
    int[] minRight = new int[N];
    minRight[N-1] = A[N-1];
    
    for (int i = N-2; i >= 0; i--) {
        minRight[i] = Math.min(minRight[i+1], A[i]);
    }
    
    for (int i = 0; i < N-1; i++) {
        maxLeft = Math.max(maxLeft, A[i]);
        if (maxLeft + minRight[i+1] >= K) {
            cuts++;
        }
    }
    
    return cuts;
    }
}
        
