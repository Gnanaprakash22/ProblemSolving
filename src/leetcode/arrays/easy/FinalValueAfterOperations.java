package leetcode.arrays.easy;

public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String arr[]={"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(arr));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int X=0;

        for(String s:operations){
            switch (s){
                case "X++":
                    X++;
                    break;
                case "++X":
                    ++X;
                    break;
                case "X--":
                    X--;
                    break;
                case "--X":
                    --X;
                    break;
            }
        }

        return X;

    }
}
