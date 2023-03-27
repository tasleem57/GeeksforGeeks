class Solution {
    public int countWaystoDivide(int N, int K) {
        return getCount(K, 1, N);
    }
    
    int getCount(int idx, int prev, int total){
        if (total < 0) return 0;
        if (idx == 1) 
            if (total >= prev) return 1;
            else return 0;
        
        int ans = 0;
        
        for (int i = prev; i <= total/idx; i++){
            ans += getCount(idx - 1, i, total - i);
        }
        
        return ans;
    }
}
