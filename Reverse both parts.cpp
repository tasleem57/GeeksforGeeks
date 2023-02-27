class Solution
{
public:

    Node *reverse(Node *head) 
    {
        Node *p = head, *pre = NULL, *nxt;
        
        while(p) {
            nxt = p->next;
            p->next = pre;
            
            pre = p;
            p = nxt;
        }
        
        return pre;
    }
   
    Node *reverse(Node *head, int k)
    {
        if(!head) return NULL;
        
        Node *first = head, *p = head, *prev;
        int i = 0;
        while(p and i < k) {
            prev = p;
            p = p->next;
            i++;
        }
        prev->next = NULL;
        
        first = reverse(first);
        Node *second = p;
        second = reverse(second);
        
        p = first;
        while(p->next) p = p->next;
        p->next = second;
        
        return first;
    }
};
