class Solution{   
public:
    int minCost(vector<vector<int>> &colors, int N) {
        // Write your code here.
        int p=colors[0][0],b=colors[0][1],y=colors[0][2];

        for(int i=1;i<N;i++){
            int a=min(b,y)+colors[i][0];
            int c=min(p,y)+colors[i][1];
            y=min(b,p)+colors[i][2];
            p=a;
            b=c;
        }

        int x=min(p,b);

        return min(x,y);
    }
};
