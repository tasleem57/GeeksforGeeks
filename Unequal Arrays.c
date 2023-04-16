class Solution {
  public:
    long long solve(int N, vector<int> &A, vector<int> &B) {
        long long int suma=0,sumb=0;
        
        vector<int>evenA; 
        vector<int>oddA;
        vector<int>evenB;
        vector<int>oddB;
        
        sort(A.begin(),A.end());
        sort(B.begin(),B.end());
        
        for(int i=0;i<N;i++){
            if(A[i]%2==0){
                evenA.push_back(A[i]);
                suma+=A[i];
            }else{
                oddA.push_back(A[i]);
                suma+=A[i];
            }
            if(B[i]%2==0){
                sumb+=B[i];
                evenB.push_back(B[i]);
            }else{
                sumb+=B[i];
                oddB.push_back(B[i]);
            }
        }
        if(suma!=sumb||(evenA.size()!=evenB.size())){
            return -1;
        }
         long long  diff=0;
        for(int i=0;i<evenA.size();i++){
            diff+=abs(evenA[i]-evenB[i]);
        }
        for(int i=0;i<oddA.size();i++){
            diff+=abs(oddA[i]-oddB[i]);
        }
        return diff/4;
    }
};
