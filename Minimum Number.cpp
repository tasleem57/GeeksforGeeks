class Solution{
public:
      int minimumNumber(int n,vector<int> &arr){
        // Code here
        bool even=false,odd=false;
        
        int se=INT_MAX,so=INT_MAX;
        
        
        
        for(int i=0;i<n;i++){
            if(arr[i]&1){
                if(arr[i]<so){
                    so=arr[i];
                }
                odd=true;
            }
            else{
                if(arr[i]<se){
                    se=arr[i];
                }
                even=true;
            }
        }
        int x;
        
        if(even&& odd)return 1;
        
        if(even)x=se;
        else x=so;
        int ans=x;
        for(int i=0;i<n;i++){
            if(arr[i]!=x){
                if(arr[i]%x!=0)
                ans=min(ans,arr[i]%x);
            }
        }
        return ans;
        
    }
};
