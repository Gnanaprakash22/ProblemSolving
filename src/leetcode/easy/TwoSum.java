package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class TwoSum {
    public static void main(String[] args) {
        int target = 6;
        int arr[] = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        //2,7,11,15
        //9
        //index of numbers which adds up to the target
        //9-2=7
        //9-7=2
        //Use a map to check whether target-nums[i] is present in map
        //Map<nums[i],index>
        //if not present add it in the map
        //if present return map.get(nums[i]) and i

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement)!=i) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new NoSuchElementException();
    }
}
