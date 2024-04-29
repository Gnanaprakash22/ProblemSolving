package leetcode;

public class MaxLengthOfRepeatedSubArray {
    public static void main(String[] args) {
        int nums1[]={1,2,3,2,1};
        int nums2[]={3,2,1,4,7};

        System.out.println(findLength(nums1,nums2));
    }

    public static int findLength(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int dp[][]=new int[m+1][n+1];
        int max=0;
        int x=0;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if(max<dp[i][j]){
                        max=dp[i][j];
                        x=i;
                    }
                }
            }
        }

        StringBuffer subArray=new StringBuffer();

        for(int i=x-1;i>1;i--){
            subArray.insert(0,nums1[i]+" ");
        }
        System.out.println("Subarray---->"+subArray);

        return max;
    }
}
