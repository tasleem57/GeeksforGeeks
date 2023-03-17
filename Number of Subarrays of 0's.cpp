long long int no_of_subarrays(int n, vector<int> &arr) {
    long long int res = 0;
    long long int count = 0;
    for(int i=0;i<n;i++){
        if(arr[i] == 0)
            count++;
        else{
            res += (count*(count+1))/2;
            count = 0;
        }
    }
    res += (count*(count+1))/2;
    return res;
}
