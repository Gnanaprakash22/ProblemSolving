package leetcode.arrays.easy;

public class FinalValueAfterOperationsUpvotedSol {
    public static void main(String[] args) {
        String arr[]={"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(arr));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String o : operations){
            x =x + (44 - o.charAt(1));
        }
        return x;
    }
}
