package leetcode;

public class LongestCommonSubString {
    public static void main(String[] args) {
        String str1="zfbcdzb";
        String str2="zbcdf";

        System.out.println(findLcs(str1,str2));
    }

    private static int findLcs(String str1,String str2){
        char charArray1[]=str1.toCharArray();
        char charArray2[]=str2.toCharArray();

        int m=str1.length();
        int n=str2.length();

        int x=0;

        int dp[][]=new int[m+1][n+1];
        int max=0;

        for(int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                if(charArray1[i-1]==charArray2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if(max<dp[i][j]){
                        max=dp[i][j];
                        x=i;
                    }
                }
            }
        }

        StringBuffer substring=new StringBuffer();

        for (int i=x-1;i>1;i--){
            substring.insert(0,charArray1[i]);
        }

        System.out.println("The longest common substring ------->"+substring);


        return max;

    }
}
