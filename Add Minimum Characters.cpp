class Solution{   
public:
     bool ispalindrome(string& s, int i, int j)
     {
        //  int i=0,j=s.size()-1;
         while(i<j)
         {
             if(s[i]!=s[j])
             return false;
             else 
             i++;
             j--;
         }
         return true;
     }
        int addMinChar(string str){    
            //code here
            if(ispalindrome(str, 0, str.length() - 1)==true)
            return 0;
            for(int i=str.length()-1;i>=0;i--)
            {
                if(ispalindrome(str, 0, i - 1))
                {
                    return str.length()-i;
                }
            }
            return str.length();
        }
};
