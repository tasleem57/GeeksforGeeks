class Solution{
public:
    vector<int> seive(){

        vector<int>ans;

        vector<int>isprime(100000 + 1 , 1);

        int n = isprime.size();

        int i , j;

        isprime[0] = 0;

        isprime[1] = 0;

        for(i=2; i<n; i++){

            if(isprime[i]){

                for(j = 2*i; j<n; j += i){

                    isprime[j] = 0;

                }

            }

        }

        for(i=2; i<n; i++){

            if(isprime[i]){

                ans.push_back(i);

            }

        }

        return ans;

    }

    Node *primeList(Node *head){

        

        vector<int>prime =  seive();

        

        Node *temp = head;

        while(temp){

            int val = temp->val;

            int index = upper_bound(prime.begin() , prime.end() , val) - prime.begin();

            

            // cout<<index<<" && ";

           

            int ans = prime[index];

            if(index -1 >= 0){

                if(abs(prime[index] - val) >= abs(prime[index - 1] - val)){

                    ans = prime[index-1];

                }

            }

            temp->val = ans;

            temp = temp->next;

        }

        return head;

  

    }
};
