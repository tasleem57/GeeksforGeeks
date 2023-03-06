class Solution {

  public:
    int noConseBits(int n) {
        // code here
        int c = 0;
        for(int i = 30; i >= 0; i--){
            int mask = 1 << i;
            if(mask & n){
                c++;
            }
            else{
                c = 0;
            }
            if(c == 3){
                n &= ~mask;
                c = 0;
            }
        }
        return n;
    }
};
