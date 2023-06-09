//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        List<String> ans = new ArrayList<>();
        
        printAll(S,ans, "");
        // sorting ans
        Collections.sort(ans);
        return ans;
    }
    
    public void printAll(String s,List<String> ans, String sAns){
        // removing dublicates and setting Base Case
        if(s.length() == 0 && !ans.contains(sAns)){ 
                ans.add(sAns);
            return;
        }
        
        for(int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String all = left + right;
            printAll(all,ans,sAns+ ch);
        }
    }
}
 