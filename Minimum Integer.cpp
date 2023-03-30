class Solution {
  public:
    int minimumInteger(int N, vector<int> &A) {
        long long sum=0;
        for(auto it:A){
             sum+=it;
        }
        int x =INT_MAX;
    for(auto a:A){
         if(sum<=(long long)N*a){
             x=min(x,a);
         }
    }
    return x;
    }
};
