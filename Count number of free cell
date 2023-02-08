class Solution{
  public:
  vector<long long int> countZero(int n, int k, vector<vector<int>>& arr){
      //Code Here
      unordered_set<int> rows,cols;
      int rem = n*n;
      vector<long long int> ans;
      for(int i = 0; i<arr.size();i++) {
          int temp = 0;
          if(!rows.count(arr[i][0])) {
              temp+= n - cols.size();
              rows.insert(arr[i][0]);
          }
          if(!cols.count(arr[i][1])) {
              temp+= n - rows.size();
              cols.insert(arr[i][1]);
          }
          rem -= temp;
          ans.push_back(rem);
      }
      return ans;
  }
};
