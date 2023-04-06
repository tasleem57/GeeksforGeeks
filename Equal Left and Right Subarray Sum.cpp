class Solution {
  public:
    int equalSum(int N, vector<int> &A) {
        // code here
        
        
        
    
        long long int sumright=0;
        long long int sumleft=0;
        for(int i=0;i<N;i++)
        {
            sumright=sumright+A[i];
        }
        for(int i=0;i<N;i++)
        {
            sumleft=sumleft+A[i];
            if(sumleft==sumright)
             return i+1;
            sumright=sumright-A[i];
        }
        return -1;
    }
    
};
