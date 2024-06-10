package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(rotLeft(list,2));
    }

    private static List<Integer> rotLeft(List<Integer> a, int d){
        rotate(a, 0, d-1);
        rotate(a, d, a.size()-1);
        rotate(a, 0, a.size()-1);
        return a;
    }

    private static void rotate(List<Integer> a,int start,int end){
        while(start<end){
            int temp=a.get(start);
            a.set(start,a.get(end));
            a.set(end, temp);
            start++;
            end--;
        }
    }
}
