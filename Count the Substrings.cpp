class Solution
{
    public:
    int countSubstring(string S)
    {
        int n = S.size();
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            int lower = 0, upper = 0;
            for(int j = i; j < n; j++) {
                if(islower(S[j])) lower++;
                else upper++;
                if(lower == upper) count++;
            }
        }
        
        return count;
    }
};
