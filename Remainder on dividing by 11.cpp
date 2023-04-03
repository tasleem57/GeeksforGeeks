class Solution
{

public:
    int xmod11(string s)
    {
        int n = s.length();
        int os = 0;
        int es = 0;
        for (int i = n - 2; i >= 0; i -= 2) os += s[i] - '0';
        for (int i = n - 1; i >= 0; i -= 2) es += s[i] - '0';
        // cout << os << " " << es << endl;
        return (11 + (es - os) % 11) % 11;
    }
};
