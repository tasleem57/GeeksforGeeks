class node
{
    int row;
    int col;
    int level;
    public node(int r,int c,int l)
    {
        this.row = r;
        this.col = c;
        this.level = l;
    }
}
//User function Template for Java
class Solution
{
    public int [][] ans;
    public boolean isValid(int r,int c,int n,int m)
    {
        if(r>=0&&c>=0&&r<n&&c<m)
            return true;
        return false;
    }
    public void bfs(int r,int c,int n,int m,char c1[][])
    {
        boolean [][]visited = new boolean[n][m];
        visited[r][c]=true;
        Queue<node> q = new LinkedList<node>();
        q.add(new node(r,c,0));
        int dx[]=new int[]{-1,1,0,0};
        int dy[]=new int[]{0,0,-1,1};
        while(!q.isEmpty())
        {
            node temp = q.poll();
            //System.out.println(c1[temp.row][temp.col]);
            if(c1[temp.row][temp.col]=='H')
            {
                ans[temp.row][temp.col]=Math.min(temp.level*2,ans[temp.row][temp.col]);
                //System.out.println("end");
            }
            for(int i=0;i<4;i++)
            {
                int nr = temp.row+dx[i];
                int nc = temp.col+dy[i];
                if(isValid(nr,nc,n,m)&&visited[nr][nc]==false&&c1[nr][nc]!='N')
                {
                    visited[nr][nc]=true;
                    q.add(new node(nr,nc,temp.level+1));
                }
            }
        }
        return;
    }
    public int[][] chefAndWells(int n,int m,char c[][])
    {
        ans = new int[n][m];
        boolean [][]visited = new boolean[n][m];
        Queue<node> q = new LinkedList<node>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(c[i][j]=='.'||c[i][j]=='N')
                {
                    ans[i][j]=0;
                }
                else if(c[i][j]=='W')
                {
                    ans[i][j]=0;
                    visited[i][j]=true;
                    q.add(new node(i,j,0));
                    //bfs(i,j,n,m,c);
                }
                else
                {
                    ans[i][j]=-1;
                }
            }
        }
        //visited[r][c]=true;
        //Queue<node> q = new LinkedList<node>();
        //q.add(new node(r,c,0));
        int dx[]=new int[]{-1,1,0,0};
        int dy[]=new int[]{0,0,-1,1};
        while(!q.isEmpty())
        {
            node temp = q.poll();
            //System.out.println(c1[temp.row][temp.col]);
            if(c[temp.row][temp.col]=='H')
            {
                if(ans[temp.row][temp.col]!=-1)
                    ans[temp.row][temp.col]=Math.min(temp.level*2,ans[temp.row][temp.col]);
                else
                    ans[temp.row][temp.col] = temp.level*2;
                //System.out.println("end");
            }
            for(int i=0;i<4;i++)
            {
                int nr = temp.row+dx[i];
                int nc = temp.col+dy[i];
                if(isValid(nr,nc,n,m)&&visited[nr][nc]==false&&c[nr][nc]!='N')
                {
                    visited[nr][nc]=true;
                    q.add(new node(nr,nc,temp.level+1));
                }
            }
        }
        return ans;
    }
}
