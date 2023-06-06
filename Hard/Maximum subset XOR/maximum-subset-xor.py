# function to return maximum XOR subset in set[]

class Solution:
    def maxSubsetXOR(self, arr, N):
        ind=0 
        for i in range(31,-1,-1):
            maxIndex=ind 
            maxElement=-10**9 
            for j in range(ind,n):
                if arr[j]&(1<<i) and arr[j]>maxElement:
                    maxIndex=j 
                    maxElement=arr[j]
            if maxElement==-10**9:
                continue 
            arr[ind],arr[maxIndex]=arr[maxIndex],arr[ind]
            maxIndex=ind
            for j in range(n):
                if j!=maxIndex and arr[j]&(1<<i):
                    arr[j]^=arr[maxIndex]
            ind+=1 
        ans=0
        for i in arr:
            ans^=i 
        return ans



#{ 
 # Driver Code Starts
if __name__=='__main__':
    t=int(input())
    for i in range(t):
        n=int(input())
        set=list(map(int,input().split()))
        obj = Solution()
        print(obj.maxSubsetXOR(set,n))

# } Driver Code Ends