class Solution{   
public:
    int minIteration(int N, int M, int x, int y){    
        // code here
         x--;y--;
        N--; M--;
        int ul = x + y;
        int lr = (N-x) + (M-y);
        int ur = x + (M-y);
        int ll = (N-x) + y;
        
        //suppos ul is max
        int max = ul;
        if(lr>max) max = lr;
        if(ur>max) max = ur;
        if(ll>max) max = ll;
            
        return max;
    }
};
