class Solution {

    public static long findMaxSubsetSum(int N, int[] A) {
        // code here
        int take=A[0];
        int ntake=0;
        for(int i=1;i<N;i++)
        {
            int newtake=Math.max(ntake+A[i],take+A[i]);
            int newntake=take;
            
            take=newtake;
            ntake=newntake;
        }
        return Math.max(take,ntake);
    }
}
