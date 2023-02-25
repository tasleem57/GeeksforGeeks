class Solution {
  public:
    int checkCompressed(string S, string T) {
        // code here
       int i=0;
       int j=0;
       while(i<S.size() && j<T.size()){
           if(isdigit(T[j])){
               int num=0;
               while(j<T.size() && isdigit(T[j])){
                   num=num*10+(T[j]-'0');
                   j++;
               }
               i+=num;
           }
           else{
               if(S[i]!=T[j]){
                   return 0;
               }
               i++;
               j++;
           }
       }
       if(i==S.size()){
           return 1;
       }
       return 0;
    }
};
