class Solution
{
    public int i = 0;
    Set<Integer> set = new HashSet<>();
    
    public Node construct(int pre[], int preM[], int last)
    {
        Node node = new Node(pre[i]);
        set.add(pre[i]);
        for(int j=0; j<pre.length-1; j++)
        {
            if(pre[i] == preM[j])
            {
                if(set.contains(preM[j+1]) || j<last)
                {
                    return node;
                }else
                {
                    i++;
                    if(i==pre.length)
                    {
                        return node;
                    }
                    node.left = construct(pre, preM, j);
                    i++;
                    if(i==pre.length)
                    {
                        return node;
                    }
                    node.right = construct(pre, preM, j);
                    return node;
                }
            }
        }
        return node;
    }
    
    public Node constructBTree(int pre[], int preM[], int size)
    {
        // your code here
        return construct(pre, preM, 0);
    }
    
}
