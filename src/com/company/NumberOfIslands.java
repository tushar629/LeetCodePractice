package com.company;

import java.util.Arrays;

public class NumberOfIslands {
    private static int count =0;
    public static int numIslands(char[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]=='1'){
                    visited(i,j,grid);
                    ++count;
                }
            }
        }
        return count;

    }

    private static void visited(int i, int j, char[][] grid) {

        if(grid[i][j]=='1'){
            grid[i][j] ='T';
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
        char a[][] = new char[][]{ {'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'} };
        System.out.println(Arrays.toString(a));
        System.out.println(numIslands(a));

    }
}
