package hackerrank;

import java.util.List;

public class JumpingOnClouds {
    public static void main(String[] args) {
        //0 1 0 0 0 1 0
        //0 0 1 0 0 1 0

        //from current index check 0 is there in index+1
        //from current index check 0 is there in index+2
        //if 0 is there in index+2 then jump +2
        //if 0 is there in index+1 and not in index+2 then jump+1
        //calculate the no of jumps

        int n=7;
        List<Integer> list=List.of(0,0,0,0);
        System.out.println(findNoOfJumps(list));
    }

    private static int findNoOfJumps(List<Integer>list){
        if(list.isEmpty())
            return 0;

        int jumpCount=0;
        for(int i=0;i<list.size();){
            if(i+2<list.size() && list.get(i+2)==0){
                i=i+2;
            }else if(i+1<list.size() && list.get(i+1)==0){
                i++;
            }else {
                break;
            }
            jumpCount++;
        }

        return jumpCount;
    }
}
