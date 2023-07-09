//{ Driver Code Starts
import java.util.*;
import java.io.*;


// } Driver Code Ends

class Solution
{
    // Function to find the smallest positive number missing from the array.
     static int missingNumber(int arr[], int n)
    {
        Arrays.sort(arr);
        int prevNum = arr[0];
        int answer = 0;
        boolean isanswerfound = false;
        
        for(int i=0; i < n ; i++){
            if(arr[i] >= 0){
                prevNum = arr[i];
                if(prevNum > 0 && prevNum != 1){
                    return 1;
                }
                break;
            }
        }
        if(prevNum < 0) {
            return 1;
        }
        for(int i=1; i < n ; i++){
            if(arr[i] >= 0){
                if(arr[i]-prevNum == 1){
                    prevNum = arr[i];
                }else if(arr[i]-prevNum > 1){
                    answer = arr[i-1]+1;
                    isanswerfound = true;
                    break;
                }
            }
        }
        if(isanswerfound){
            return answer;
        }else{
            return arr[n-1]+1;
        }
        
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) throws IOException
    {

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		
        //taking testcases
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
		    
		    //input number n
			int n=Integer.parseInt(in.readLine().trim());
			int[] arr=new int[n];
			String s[]=in.readLine().trim().split(" ");
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(s[i]);
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			out.println(missing);
		}
		out.close();
    }
}


// } Driver Code Ends