package com.company;

import java.util.Arrays;

public class MaximunOrderVolume {

    static int curentValue(int[][] portion, int n, int i, int j) {

        int p = i, q = j;
        if (i < n && j < n) {
            if (portion[i][1] <= portion[j][0])
                return portion[j][2] + curentValue(portion, n, j, j + 1);
            else
                return curentValue(portion, n, i, j + 1);
        } else if (i >= n || j >= n)
            return 0;
        else
            return curentValue(portion, n, p, q);

    }

    public static void main(String[] args) {

        MaximunOrderVolume obj = new MaximunOrderVolume();
        int[] start = new int[]{10, 5, 15, 18, 30};
        int[] duration = new int[]{30, 12, 20, 35, 35};
        int[] volume = new int[]{50, 51, 20, 25, 10};

        obj.mov(start, duration, volume);


    }

    private void mov(int[] start, int[] duration, int[] volume) {

        int[][] portion = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < 3; j++) {
                portion[i][0] = start[i];
                portion[i][1] = duration[i] + start[i];
                portion[i][2] = volume[i];
            }
        }
//        System.out.println(Arrays.deepToString(portion));
        int n = start.length;
        int[] temp;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (portion[j][0] >= portion[i][0]) {
                    temp = portion[i];
                    portion[i] = portion[j];
                    portion[j] = temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(portion));

        int[] cost = new int[start.length * 3];
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                cost[count] = portion[i][2] + curentValue(portion, n, i, j);
                count++;
            }
        }

        cost[count] = portion[n - 1][2];
        Arrays.sort(cost);
        System.out.println(cost[cost.length - 1]);

    }


}
