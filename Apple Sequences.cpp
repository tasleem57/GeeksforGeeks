class Solution{   
public:
    int appleSequences(int n, int m, string arr){
        int i = 0, j = 0, ans = 0;
        while(j <= n) {
            if(m < 0) {
                if(arr[i++] == 'O') m++;
            }
            else {
                ans = max(ans, j-i);
                if(j < n && arr[j] == 'O') m--;
                j++;
            }
        }
        return ans;
    }
};
