package com.company;

import java.util.*;
import java.util.stream.Collectors;


public class KClosestPointstoOrigin {
    class Point{
        int x,y;
        double distance = 0;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
            this.distance =  Math.sqrt(x*x +y*y);

        }
        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    ", distance=" + distance +
                    '}';
        }
    }
    public int[][] kClosest(int[][] points, int K) {

        ArrayList<Point> list1 = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            list1.add(new Point(points[i][0],points[i][1]));
        }
//        System.out.println(list1.toString());
        list1.sort(Comparator.comparing(s ->s.distance));
//        System.out.println(list1.toString());

        int[][] result = new int[K][2];
        for(int i = 0; i < K; i++) {
            result[i][0] = list1.get(i).x;
            result[i][1] = list1.get(i).y;
        }

        return result;
    }


    public static void main(String[] args) {
        KClosestPointstoOrigin obj = new KClosestPointstoOrigin();
        int p[][] = new int[][]{{-2,2},{1,3},{5,6},{0,1}};

        System.out.println(Arrays.deepToString(obj.kClosest(p,1)));
    }
}
