package leetcode.arrays.easy;

import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    public static int[] getConcatenation(int[] nums) {
        int numsCopy[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            numsCopy[i]=nums[i];
        }
        int j=0;
        for(int i=nums.length;i<numsCopy.length;i++){
            numsCopy[i]=nums[j];
            j++;
        }

        return numsCopy;
    }
}
