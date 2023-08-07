//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean isPossible(int grid[][],int row,int col,int digit)
    {
        //check row
        for(int i = 0;i<9;i++)
        {
            if(grid[i][col]==digit)
            return false;
        }
        //check col
        for(int i = 0;i<9;i++)
        {
            if(grid[row][i]==digit)
            return false;
        }
        //check grid
        int gridx = (row/3) * 3;
        int gridy = (col/3) * 3;
        for(int i = gridx;i<gridx+3;i++)
        {
            for(int j = gridy;j<gridy+3;j++)
            {
                if(grid[i][j]==digit)
                {
                    return false;
                }
            }
        }
        return true;
    }
    static boolean sudoku(int grid[][],int row,int col)
    {
        int newcol = col+1;
        int newrow = row;
        if(newcol == 9)
        {
            newcol = 0;
            newrow=row+1;
        }
        //base case
        if(row==9&&col==0)
        {
            return true;
        }
        if(grid[row][col]!=0)
        {
            return sudoku(grid,newrow,newcol);
        }
        for(int i=1;i<=9;i++)
        {
            if(isPossible(grid,row,col,i))
            {
                grid[row][col] = i;
              if(sudoku(grid,newrow,newcol))
              return true;
            }
            grid[row][col] = 0;
        }
        return false;
    }
    static boolean SolveSudoku(int grid[][])
    {
        if(sudoku(grid,0,0))
        {
            return true;
        }
        return false;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[1].length;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
        }
    }
}