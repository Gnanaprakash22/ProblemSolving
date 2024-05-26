package leetcode.arrays.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums){
        Set<Integer>set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                return false;
            set.add(nums[i]);
        }

        return true;
    }
}
