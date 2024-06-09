package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class RepeatedString {
    public static void main(String[] args) {
        //abcac
        //abcacabcac
        //10
        //aba
        //abaabaabaa

        String str="a";
//        long n=10;
        long n=1000000000000L;

        System.out.println(findOccurrenceOfChar(str,n));

    }

    private static long findOccurrenceOfChar(String s,long n){
        //abcac
        //2
        //10%5=0
        //10/5=2
        //2*2=4
        //check if 1 is a and add it to 6
        long strLength = s.length();
        // Count the number of 'a' in the given string
        int count = 0;
        for (int i = 0; i < strLength; i++) {
            if (s.charAt(i) == 'a') {
                ++count;
            }
        }

        long stringLeftToBeCovered=n % strLength;
        long stringAlreadyCovered=count*(n/strLength);

        int extraCount=0;
        for (int i = 0; i < stringLeftToBeCovered; i++) {
            if (s.charAt(i) == 'a') {
                ++extraCount;
            }
        }

        long totalCount=stringAlreadyCovered+extraCount;

        return totalCount;
    }
}
