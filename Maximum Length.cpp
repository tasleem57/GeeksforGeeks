class Solution {
public:
    int solve(int a, int b, int c) {
        // code here
if(c-2*(a+b)>=3)return -1;
         if(b-2*(a+c)>=3)return -1;
          if(a-2*(c+b)>=3)return -1;
        return a+b+c;
    }
};
