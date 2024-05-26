package leetcode.arrays.easy;

import java.util.Arrays;

public class BuildArrayFromPermutation {

    //o/p - 0,1,2,4,5,3

    public static void main(String[] args) {
        int arr[]={0,2,1,5,3,4};
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
            //meta = num1 + (some_constant)*num2
            //num1 or nums[i] = meta % some_constant
            //num2 or nums[nums[i]] = meta / some_constant
            //0,2,1,5,3,4
            //0+0*1001=0,2+1*1001=1003,1+2*1001=2003,5+4*1001=4009,3+5*1001=5008,4+3*1001=3007
        }

        for (int i=0;i<nums.length;i++){
            nums[i]/=CONST;
            //0,1003/1001=1,2003/1001=2,4009/1001=4,5008/1001=5,3007/1001=3
            //0,1,2,4,5,3

        }

        return nums;
    }
}
