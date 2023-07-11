//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
	int startRow=0;
    int startCol=0;
    int endRow=n-1;
    int endCol=m-1;
    int count=0;
    while(startRow<=endRow && startCol<=endCol&&count!=k)
    {
       //top
       for(int j=startCol;j<=endCol;j++)
       {
            count++;
           if(count==k)
           {
            return A[startRow][j];
           }
          
       }
       
       //right
       for(int i=startRow+1;i<=endRow;i++)
       {
              count++;
           if(count==k)
           {
           return A[i][endCol];
           }
        
       }
       //bottom
       for(int j=endCol-1;j>=startCol;j--)
       {
           count++;
           if(count==k)
           {
               return A[endRow][j]; 
           }
           
         
       }
       //left
       for(int i=endRow-1;i>=startRow+1;i--)
       {
           count++;
           if(count==k)
           {
              return A[i][startCol];
           }
           
          
       }
       startRow++;
       startCol++;
       endRow--;
       endCol--;
    }
     
    return -1;
 

    }
}