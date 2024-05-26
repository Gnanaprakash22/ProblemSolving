package leetcode.arrays.easy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }


    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums[nums.length-1];i++){
            if(i!=nums[i]){
                return i;
            }
        }

        return nums[nums.length-1]+1;
    }
}