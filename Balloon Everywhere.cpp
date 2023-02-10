class Solution{
public:
    int maxInstance(string s){
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s[i] == 'b') b++;
            if(s[i] == 'a') a++;
            if(s[i] == 'l') l++;
            if(s[i] == 'o') o++;
            if(s[i] == 'n') n++;
        }
        return min(b , min(a , min(l/2 , min(o/2 , n))));
    }
};
