class Solution{
  public:
    /*You are required to complete below method */
    int maxLevelSum(Node* root) {
        queue<Node*>q;
        q.push(root);
        int ans = INT_MIN;
        
        while(!q.empty()){
            int size = q.size(),sum = 0;
            while(size--){
                auto curr = q.front();
                q.pop();
                sum+=curr->data;
                if(curr->left)q.push(curr->left);
                if(curr->right)q.push(curr->right);
            }
            ans = max(ans,sum);
        }
        
        return ans;
    }
};

