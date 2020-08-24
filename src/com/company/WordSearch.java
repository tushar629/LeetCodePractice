package com.company;

public class WordSearch {


    public boolean exist(char[][] board, String word) {

        for (int k = 0; k < word.length(); k++) {

            char alphabet = word.charAt(k);

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
//                    if (alphabet==board[i][j])
                        visited(i,j,board);
                }
            }
        }

        return false;
    }

    private void visited(int i ,int j,char[][] grid)  {

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

    public static void main(String[] args) {
        WordSearch obj = new WordSearch();
        char[][] a = new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(obj.exist(a,"ABCCED"));
    }
}
