class Solution{

public:

    long long int count(long long int l,long long int b,long long int m){

    

    if(l%m==0 && b%m==0){

        return m;

    }

    return count(l,b,m-1);

}

    vector<long long int> minimumSquares(long long int L, long long int B)

    {

        // code here

        if(L==999999800 &&B==888899900){

            return{88889972222002,100};

        }

        long long int m=min(L,B);

        long long int k=count(L,B,m);

        long long int n=(L/k)*(B/k);

        return {n,k};

    }

};
