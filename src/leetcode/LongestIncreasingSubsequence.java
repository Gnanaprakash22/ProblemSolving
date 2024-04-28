package leetcode;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int nums[]={3,4,-1,0,6};
        System.out.println(lengthOfLIS(nums));
    }

    private static int lengthOfLIS(int nums[]){
        //     j   i
        //3,4,-1,0,6
        //1 2 1 2 3

        int length=nums.length;
        int dp[]=new int[length];
        Arrays.fill(dp,1);//O(n)

        for(int i=1;i<length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                    }
                }
            }
        }

        int lengthOfLis=dp[0];

        for(int i=0;i<length;i++){
            lengthOfLis=Math.max(lengthOfLis,dp[i]);
        }

        return lengthOfLis;

    }
}
