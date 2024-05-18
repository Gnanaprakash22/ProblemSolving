package leetcode.easy;

import java.util.Arrays;

public class BuildArrayFromPermutation {

    //o/p - 0,1,2,4,5,3

    public static void main(String[] args) {
        int arr[]={0,1,2,4,5,3};
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    private static int[] buildArray(int[] nums) {
//        int numsCopy[]=new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            numsCopy[i]=nums[nums[i]];
//        }

        //Time complexity - O(n)
        //Space complexity -O(n)

//        return numsCopy;

        int CONST=1001;

        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int b=nums[a]%CONST;
            nums[i]=a+b*CONST;
        }

        for (int i=0;i<nums.length;i++){
            nums[i]/=CONST;
        }

        return nums;
    }
}
