package leetcode;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1="abcdaf";
        String str2="acbcf";

        System.out.println(findLcs(str1,str2));
    }

    public static int findLcs(String str1,String str2){
        int dp[][]=new int[str1.length()+1][str2.length()+1];

        for(int i=1;i<= str1.length();i++){
            for(int j=1;j<=str2.length();j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        System.out.println(printLcs(str1,str2,dp));
        return dp[str1.length()][str2.length()];
    }

    public static String printLcs(String str1, String str2, int dp[][]) {
        int i = str1.length(), j = str2.length();
        StringBuilder sb = new StringBuilder();

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                sb.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return sb.reverse().toString();
    }
}