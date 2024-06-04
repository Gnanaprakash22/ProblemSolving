package leetcode.arrays.easy;

import java.util.Arrays;

public class LargestLocalValuesInMatrix {
    public static void main(String[] args) {
//        int arr[][]={{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int arr[][]={{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int ans[][]=largestLocal(arr);

        for(int i=0;i<ans.length;i++){
            for (int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] largestLocal(int[][] grid) {
        int ans[][]=new int[grid.length-2][grid.length-2];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                ans[i][j]=getMaxValuesAcross3x3Matrix(grid,i,j);
            }
        }

        return ans;
    }

    public static int getMaxValuesAcross3x3Matrix(int [][] grid,int l,int r){
        int max=0;
        for(int i=l;i<l+3;i++){
            for(int j=r;j<r+3;j++){
                max=Math.max(grid[i][j],max);
            }
        }

        return max;
    }
}
