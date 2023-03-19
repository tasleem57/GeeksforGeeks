class Solution {
  public:
    vector<int> getDistinctDifference(int N, vector<int> &A) {
        vector<int>ans;
        unordered_map<int, int>mp1;
        unordered_map<int, int>mp2;
        for(auto it : A){
            mp2[it]++;
        }
        for(int i=0;i<N;i++){
            int tmp = A[i];
            mp2[tmp]--;
            if(mp2[tmp] == 0){
                mp2.erase(tmp);
            }
            ans.push_back(mp1.size() - mp2.size());
            mp1[tmp]++;
        }
        return ans;
        // code here
    }
};
