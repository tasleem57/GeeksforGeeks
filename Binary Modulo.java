class Solution{
	int modulo(String s, int m) {
		//Write your code here
		
		
		     int x = 0;
        for(int i=0;i<s.length();i++)
        {
            int temp = s.charAt(i)-'0';
            x = ((x<<1)+temp)%m;
        }
        return x;
	}
}
