package leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingChar {
    public static void main(String[] args) {
        String words[]={"abc","bcd","aaaa","cbc"};
        char x='z';
        System.out.println(findWordsContaining(words,x));
    }

    public static List<Integer> findWordsContaining(String[] words, char x){
        List<Integer>indices=new ArrayList<>();

        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                indices.add(i);
            }
        }

        return indices;
    }
}
