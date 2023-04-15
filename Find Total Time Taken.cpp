 class Solution {
  public:
    int totalTime(int n, vector<int> &arr, vector<int> &time) {
        // code here
        unordered_map<int,int> m;
        int total_time=0;
        for(int i=0;i<arr.size();i++)
        {
            if(m.find(arr[i])==m.end())
            {
                m[arr[i]]=total_time;
            }
            else
            {
                total_time=max(total_time,m[arr[i]]+time[arr[i]-1]);
                m[arr[i]]=total_time;
            }
            total_time++;
        }
        return total_time-1;
    }
};
