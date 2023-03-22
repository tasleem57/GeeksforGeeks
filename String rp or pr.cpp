class Solution{   
public:
    long long solve(int x,int y,string s){
      //code here
      long long n=s.length(),ans=0;
      vector<string>v(5);
      v[0]="pr";v[1]="rp";
      if(x<y)swap(v[0],v[1]),swap(x,y);
      stack<char>st;
      for(int i=0;i<n;i++){
          if(!st.size())st.push(s[i]);
          else{
              string tmp="";
              tmp+=st.top();tmp+=s[i];
              if(tmp==v[0])st.pop(),ans+=x;
              else st.push(s[i]);
          }
      }
      string t="";
      while(st.size())t+=st.top(),st.pop();
      reverse(begin(t),end(t));
    //   cout<<t<<"---"<<ans<<endl;
      for(int i=0;i<t.length();i++){
          if(!st.size())st.push(t[i]);
          else {
              string tmp="";
              tmp+=st.top();tmp+=t[i];
              if(tmp==v[1])st.pop(),ans+=y;
              else st.push(t[i]);
          }
      }
      return ans;
    }
};
