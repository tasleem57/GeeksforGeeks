class Solution{
    public:
    
    Shop shop;
    Solution(Shop s)
    {
        this->shop = s;
    }
    long long find(int n, long k){
        // Return the number of chocolates Geek had
        // enjoyed out of 'n' chocolates availabe in the
        // 'shop'.
         long long ans=0;
        int l=0;
        int h=n-1;
        while(k>0){
             int ind;
             int cost=-1;
             while(l<=h){
                 int mid=l+(h-l)/2;
                 int num=shop.get(mid);
                 if(num<=k){
                     ind=mid;
                     cost=num;
                     l=mid+1;
                 }
                 else{
                     h=mid-1;
                 }
             }
              
             if(cost==-1){
                 break;
             }
             while(cost<=k){
                 k-=cost;
                  ans++;
             }
             l=0;
             h=ind;
        }
        return ans;
    }

};
