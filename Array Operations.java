class Solution {
    public static int arrayOperations(int n, int[] arr) {
        // code here
          int nz=0,count=0;
        for(int ele:arr)
        {
            if(ele==0)
            {
                if(nz==1)count++;
                nz=0;
            }
            else nz=1;
        }
        if(nz==1)count++;
        return count;
    }
}
