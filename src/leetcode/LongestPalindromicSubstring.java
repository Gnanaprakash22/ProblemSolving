package leetcode;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str="cbbd";
        System.out.println(longestPalindrome(str));
    }

    private static String longestPalindrome(String s){
        if(s.length()<=1)
            return s;

        String LPS="";

        for(int i=1;i<s.length();i++){
            int high=i;
            int low=i;

            while (s.charAt(low)==s.charAt(high)){
                low--;
                high++;

                if(low==-1 || high==s.length())
                    break;
            }

            String palindrome=s.substring(low+1,high);
            if(LPS.length()<palindrome.length()){
                LPS=palindrome;
            }
        }

        for(int i=1;i<s.length();i++){
            int high=i;
            int low=i-1;

            while (s.charAt(low)==s.charAt(high)){
                low--;
                high++;

                if(low==-1 || high==s.length())
                    break;
            }

            String palindrome=s.substring(low+1,high);
            if(LPS.length()<palindrome.length()){
                LPS=palindrome;
            }
        }

        return LPS;
    }
}
