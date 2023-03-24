class Solution {
  public:
    string removeReverse(string S) {
        vector<int>vis(26,0);
        for(int i=0;i<S.length();i++)vis[S[i]-'a']++;
        int i=0,j=S.length()-1;
        int re=0;
        int ct=0;
        while(i<=j){
            if(re==0){
                if(vis[S[i]-'a']>1){
                    char T=S[i];
                    S[i]='#';
                   vis[T-'a']--;

                    re=1;ct++;
                }
                i++;
            }
            else{
                if(vis[S[j]-'a']>1){
                    char T=S[j];
                    S[j]='#';
                    vis[T-'a']--; 
                    
                    re=0;ct++;
                }
                j--;
            }
        }
        i=0,j=0;
        while(i<S.length() and j<S.length()){
            while(S[j]=='#')j++;
            swap(S[i],S[j]);
            i++;j++;
        }
        ct=S.length()-ct;
        if(re==1){
            reverse(S.begin(),S.begin()+ct);
        }
        return S.substr(0,ct);
        

    }
};
