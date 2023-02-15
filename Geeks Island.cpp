//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{    
public: 
    int water_flow(vector<vector<int>> &g,int n,int m){ 
 
    //indian ocean 
 
    bool in[n][m]; 
 
    memset(in,false,sizeof(in)); 
 
    queue<vector<int>>q; 
 
    for(int i=0;i<n;i++){q.push({i,0});in[i][0]=true;} 
 
    for(int i=0;i<m;i++){q.push({0,i});in[0][i]=true;} 
 
    while(!q.empty()) 
 
    { 
 
        vector<int>v=q.front();q.pop(); 
 
        int a=v[0];int b=v[1]; 
 
        if(a<n-1&&in[a+1][b]==false&&g[a+1][b]>=g[a][b]){in[a+1][b]=true;q.push({a+1,b});} 
 
        if(b<m-1&&in[a][b+1]==false&&g[a][b+1]>=g[a][b]){in[a][b+1]=true;q.push({a,b+1});} 
 
        if(a>0&&in[a-1][b]==false&&g[a-1][b]>=g[a][b]){in[a-1][b]=true;q.push({a-1,b});} 
 
        if(b>0&&in[a][b-1]==false&&g[a][b-1]>=g[a][b]){in[a][b-1]=true;q.push({a,b-1});} 
 
    } 
 
    bool ar[n][m]; 
 
    memset(ar,false,sizeof(ar)); 
 
    for(int i=0;i<n;i++){q.push({i,m-1});ar[i][m-1]=true;} 
 
    for(int i=0;i<m;i++){q.push({n-1,i});ar[n-1][i]=true;} 
 
    while(!q.empty()) 
 
    { 
 
        vector<int>v=q.front();q.pop(); 
 
        int a=v[0];int b=v[1]; 
 
        if(a<n-1&&ar[a+1][b]==false&&g[a+1][b]>=g[a][b]){ar[a+1][b]=true;q.push({a+1,b});} 
 
        if(b<m-1&&ar[a][b+1]==false&&g[a][b+1]>=g[a][b]){ar[a][b+1]=true;q.push({a,b+1});} 
 
        if(a>0&&ar[a-1][b]==false&&g[a-1][b]>=g[a][b]){ar[a-1][b]=true;q.push({a-1,b});} 
 
        if(b>0&&ar[a][b-1]==false&&g[a][b-1]>=g[a][b]){ar[a][b-1]=true;q.push({a,b-1});} 
 
    } 
 
    int ans=0; 
 
    for(int i=0;i<n;i++) 
 
    { 
 
        for(int j=0;j<m;j++) 
 
        { 
 
            if(ar[i][j]==true&&in[i][j]==true)ans++; 
 
        } 
 
    } 
 
    return ans; 
 
} 
};


//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n,m;
        cin>>n>>m;
        vector<vector<int>> mat(n, vector<int>(m));
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                cin>>mat[i][j];
            }
        }
        Solution ob;
        cout << ob.water_flow(mat, n, m) << endl;
        
    }
}


// } Driver Code Ends
