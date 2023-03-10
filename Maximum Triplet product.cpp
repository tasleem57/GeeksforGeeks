class Solution {
  public:
    long long maxTripletProduct(long long arr[], int n)
    {
        long long int fmin=INT_MAX;
        long long int smin=INT_MAX;
        long long int fmax=INT_MIN;
        long long int smax=INT_MIN;
        long long int tmax=INT_MIN;
        for(int i=0;i<n;i++){
            if(arr[i]<fmin){
                smin=fmin;
                fmin=arr[i];
            }
            else if(arr[i]<smin){
                smin=arr[i];
            }
            
            if(arr[i]>fmax){
                tmax=smax;
                smax=fmax;
                fmax=arr[i];
            }
            else if(arr[i]>smax){
                tmax=smax;
                smax=arr[i];
            }
            else if(arr[i]>tmax){
                tmax=arr[i];
            }
        }
        
        return max(fmax*smax*tmax,fmin*smin*fmax);
    	
    }
};
