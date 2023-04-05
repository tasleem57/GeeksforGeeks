class Solution {
  public:
    int countSpecialNumbers(int N, vector<int> arr) {
        // Code here
        int count =0;
       sort(arr.begin() , arr.end());
        for(int i = 0 ; i<arr.size() ; i++)
        {
            if(arr[i] == arr[i+1] && i+1 <arr.size())
            count++;
            
            else
            for(int j = 0 ; j<i ; j++)
            {
                if(arr[i] % arr[j] ==0)
                {
                    count++;
                    break;
                }
            }
            
            
        }
        return count;
    }
};
