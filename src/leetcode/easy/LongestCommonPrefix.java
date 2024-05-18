package leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[]={"clap","club","clove"};
        System.out.println(findLCP(strs));
    }

    private static String findLCP(String[] strs){
        StringBuilder commonPrefix=new StringBuilder();
        Arrays.sort(strs);

        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i])break;
            commonPrefix.append(first[i]);
        }

        return commonPrefix.toString();

//        String prefix=strs[0];
//
//        for(int i=1;i< strs.length;i++){
//            while (strs[i].indexOf(prefix)!=0){
//                prefix=prefix.substring(0,prefix.length()-1);
//            }
//        }
//
//        return prefix;
    }
}
