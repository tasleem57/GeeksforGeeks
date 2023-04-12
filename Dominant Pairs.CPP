class Solution{
public:
    int dominantPairs(int n,vector<int> &arr){
        // Code here
        sort(arr.begin(),arr.begin()+n/2);
    sort(arr.begin()+n/2,arr.end());
    
    int cnt = 0;
    for(int i=0;i<n/2;i++){
        int x = arr[i] < 0 && arr[n/2] < 0 ? (arr[i]-4)/5 : arr[i]/5;
        int ub = upper_bound(arr.begin()+n/2,arr.end(),x) - arr.begin();
        if(arr[i] >= 5*arr[ub-1])cnt += ub - n/2;
    }
    
    return cnt;
    }  
};
