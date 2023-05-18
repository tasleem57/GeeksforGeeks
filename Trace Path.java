class Solution {
    static int isPossible(int n, int m, String s){
        // code here
        int curRow=0, curCol=0, minRow=0, maxRow=0, minCol=0, maxCol=0;

        for(char ch:s.toCharArray())
        {

            if(ch=='L') curCol--;

            if(ch=='R') curCol++;

            if(ch=='U') curRow--;

            if(ch=='D') curRow++;


            minRow=Math.min(minRow, curRow);

            maxRow=Math.max(maxRow, curRow);

            minCol=Math.min(minCol, curCol);

            maxCol=Math.max(maxCol, curCol);

        }
        return maxRow-minRow<n && maxCol-minCol<m?1:0;
    }
}
