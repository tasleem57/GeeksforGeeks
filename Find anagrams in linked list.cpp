class Solution {
  public:
    vector<Node*> findAnagrams(struct Node* head, string s) {
        // code here
        vector<int> v(26,0),temp(26,0);
        vector<Node*> ans;
        
        for (auto it: s){
            v[it-'a']++;
        }
        
        
        bool prev=false;
        Node* start=NULL;
        
        while (head){
            
            if (v[(head->data)-'a']){
                
                if (prev==false){

                    prev=true;
                    start=head;
                    
                }
                
                temp[(head->data)-'a']++;
                
                if (temp[(head->data)-'a']>v[(head->data)-'a']){
                    while (temp[(head->data)-'a']>v[(head->data)-'a']){
                        temp[(start->data)-'a']--;
                        start=start->next;
                    }
                    
                    head=head->next;
                }
                else if (temp==v){
                    prev=false;
                    Node* curr=head->next;
                    head->next=NULL;
                    ans.push_back(start);
                    head=curr;
                    for (int i=0; i<26; i++){
                         temp[i]=0;
                    }
                }
                else{
                    head=head->next;
                }
   
            }
            else{
               
                prev=false;
                    for (int i=0; i<26; i++){
                        temp[i]=0;
                    }
                head=head->next;
            }
        
        }
        
     return ans;
    }
};
