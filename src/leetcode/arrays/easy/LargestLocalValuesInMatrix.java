package leetcode.arrays.easy;

import java.util.Arrays;

public class LargestLocalValuesInMatrix {
    public static void main(String[] args) {
        int arr[][]={{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        System.out.println(Arrays.toString(largestLocal(arr)));
    }

    public static int[][] largestLocal(int[][] grid) {
        int max;
        int newGrid[][]=new int[grid.length-2][grid.length-2];
        int x=0;
        int y=0;
        for(int i=0;i<grid.length;i++){
            max=Integer.MIN_VALUE;
            for(int j=0;j<grid.length-1;j++){
                for(int k=0;k<grid.length-1;k++){
                    max= Math.max(max,grid[i][j]);
                }
            }
            System.out.println(max);
        }

        return newGrid;
    }
}
