//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot);
            quickSort(arr,pivot+1,high);
        }
    }
    static int partition(int arr[], int l, int h)
    {
        // your code here
         
        int pivot=arr[l];
        int i=l-1;int j=h+1;
        while(true){
            do{
                i++;
            }
            while(arr[i]<pivot);
            do{
                j--;
            }
            while(arr[j]>pivot);
        
        if(i>=j)   return j;  // aak dusro ko cross kar de tab
        // otherwise swap
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    } 
}