class Solution {
  public:
    long long int minOperations(int N) {
    long long n = N/2;
    long long ans = n*n;
    if(N&1) ans += n;
    return ans;
}
};
