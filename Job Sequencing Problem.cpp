class Solution 
{
    public:
    //Function to find the maximum profit and the number of jobs done.
    static bool Compare(const Job &a,const Job& b)
    {
        if(a.profit>b.profit)
        return true;
        else
        return false;
    }
    vector<int> JobScheduling(Job arr[], int n) 
    { 
        // your code here
         sort(arr,arr+n,Compare);
        
        vector<int>deadline(101,0);
        int ans=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            
            int j=arr[i].dead;
            while(j>=1)
            {
                if(deadline[j]==0)
                {
                     ans=ans+arr[i].profit;
                        count++;
                        deadline[j]=1;
                        break;
                }
                
                j-- ;
               
            }
        }
        
        vector<int>result;
        result.push_back(count);
        result.push_back(ans);
        
        return result ;
    } 
};
