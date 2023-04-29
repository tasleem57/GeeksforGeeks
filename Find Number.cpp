class Solution
{
    public long findNumber(long N)
    {
        String s="";
        while(N>0){
            long d=N%5;
            s=d+s;
            if(d==0)N=N/5-1;
            else N/=5;
        }
        s=s.replace('0','9');
        s=s.replace('4','7');
        s=s.replace('3','5');
        s=s.replace('2','3');
        return Long.parseLong(s);
    }
}
