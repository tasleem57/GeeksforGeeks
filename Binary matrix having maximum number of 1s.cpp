class Solution {
public:
    vector<int> findMaxRow(vector<vector<int>> mat, int n) {
        //code here
                int row = -1;

        int finAns=INT_MAX;

        for(int i=0;i<n;i++){

            int start=0;

            int end=n-1;

            int ans=INT_MAX;

            while(start<=end){

                int mid = start + (end-start)/2;

                if(mat[i][mid]==1)

                {

                    ans=min(ans,mid);

                    end=mid-1;

                }

                else

                    start=mid+1;

            }

            if(ans<finAns){

                row=i;

                finAns=ans;

            }

        }

        vector<int> v;

        if(row==-1){

            v.push_back(0);

            v.push_back(0);

        }

        else{

            v.push_back(row);

            v.push_back(n-finAns);

        }

        return v;
    }
};
