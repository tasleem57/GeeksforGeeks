class Solution{
public:
    vector<int> optimalArray(int n,vector<int> &a){
        // Code here
      vector<int>ans(n,0),p(n,0);
      p[0]=a[0];
      for(int i=1;i<n;i++){
        p[i]=p[i-1]+a[i];
      }
    //  for(auto it:p)
    //  cout<<it<<" ";
      for(int i=1;i<n;i++){
         int m=(i+1)/2;
         int r=p[i]-p[m];
         int ld=abs(m*a[m]-p[m-1]);
        // cout<<m<<endl;
         int rd=abs(abs(i-m)*a[m]-r);
         ans[i]=ld+rd;
      }
      return ans;
    }
};
