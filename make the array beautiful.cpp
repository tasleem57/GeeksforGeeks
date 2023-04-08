class Solution {
  public:
    vector<int> makeBeautiful(vector<int> arr) {
        // code here
        int n = arr.size();
        for(int  i=0;i<n-1;i++){
            // if(i<0) i=0;
            if((arr[i]<0 && arr[i+1]>=0) || (arr[i]>=0 && arr[i+1]<0)){
                arr.erase(arr.begin()+i,arr.begin()+i+2);
                n-=2;
                i-=2;
                i=max(-1,i);
                
            }
        }
        return arr;
    }
};
