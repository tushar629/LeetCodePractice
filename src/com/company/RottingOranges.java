package com.company;

public class RottingOranges {
    private static int count =0;
    public static int orangesRotting(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '2') {
                    visited(i, j, grid);
                    ++count;
                }
            }
        }
        return count;
    }
    public static void visited(int i , int j,int[][] grid){

        {
            grid[i][j] ='2';
            if(i+1 < grid.length){ //right possible
                visited(i+1,j,grid);
            }
            if(i-1>= 0){ //left possible
                visited(i-1,j,grid);
            }
            if(j+1 < grid[i].length){ //down possible
                visited(i,j+1,grid);
            }
            if(j-1>=0){ //up possible
                visited(i,j-1,grid);
            }
        }

    }
    public static void main(String[] args) {
        int [][]a = new int[][]{{'2','1','1'},{'1','1','0'},{'0','1','1'}};
        System.out.println(orangesRotting(a));
    }

}
