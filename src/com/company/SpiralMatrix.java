package com.company;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        if(matrix.length == 0)
            return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<>();
        int cStart = 0;
        int rStart = 0;
        int rEnd = matrix.length - 1;
        int cEnd = matrix[0].length - 1;

        while(cStart <= cEnd &&rStart <= rEnd){

            for (int c = cStart ; c <= cEnd ; c++)
                result.add(matrix[rStart][c]);

            for (int r  = rStart +1; r <= rEnd ; r++)
                result.add(matrix[r][cEnd]);

            for (int c = cEnd -1 ; c >= cStart ; c--) {
                if(rStart == rEnd)
                    break;
                result.add(matrix[rEnd][c]);
            }
            for (int r = rEnd -1 ; r > rStart ; r--){
                if(cStart==cEnd)
                    break;
                result.add(matrix[r][cStart]);

            }

            cStart++;
            rStart++;
            cEnd--;
            rEnd--;

        }


        return result;

    }

    public static void main(String[] args) {

        int[][] ar = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(spiralOrder(ar));

    }
}
