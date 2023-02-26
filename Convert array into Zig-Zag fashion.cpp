class Solution {
  public:
    // Program for zig-zag conversion of array
    void zigZag(int arr[], int n) {
        // code here
        for(int i=0; i<n-1; i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    swap(arr[i],arr[i+1]);
                }
                else {
                    continue;
                }
            }
            else if(arr[i]<arr[i+1]){
                swap(arr[i],arr[i+1]);
            }
        }
    }
};
