package leetcode.medium;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int nums[] = {3, 4, -1, 0, 6};
        System.out.println(lengthOfLIS(nums));
    }

    private static int lengthOfLIS(int nums[]) {
        //     j   i
        //3,4,-1,0,6
        //1 2 1 2 3
        //Tracing the subsequence

        int length = nums.length;
        int dp[] = new int[length];
        int traceSubsequence[] = new int[length];
        Arrays.fill(dp, 1);//O(n)

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        traceSubsequence[i] = j;
                    }
                }
            }
        }

        int lengthOfLis = dp[0];
        int endIndex=0;

        for (int i = 1; i < length; i++) {
            if(lengthOfLis<dp[i]){
                lengthOfLis=dp[i];
                endIndex=i;
            }
        }

        // Print the subsequence
        int index = endIndex;
        StringBuilder subsequence = new StringBuilder();
        int printedLength=0;
        while (index >= 0 && printedLength < lengthOfLis) {
            subsequence.insert(0, nums[index] + " ");
            index = traceSubsequence[index];
            printedLength++;
        }

        System.out.println("The longest increasing subsequence is: " + subsequence.toString().trim());


        return lengthOfLis;

    }

}
