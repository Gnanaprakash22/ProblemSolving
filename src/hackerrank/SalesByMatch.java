package hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
    public static void main(String[] args) {
        System.out.println(sockMerchant(10,List.of(1 ,1 ,3 ,1, 2, 1, 3, 3, 3, 3)));
    }


    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int count=0;
        Map<Integer,Integer> map = new HashMap<>();
        //10 20 20 10 10 30 50 10 20


        for(int i=0;i<n;i++){
            if(!map.containsKey(ar.get(i))){
                map.put(ar.get(i), 1);
            }else{
                map.put(ar.get(i), map.get(ar.get(i)) + 1 );
                if(map.get(ar.get(i))%2==0) {
                    count++;
                }
            }
        }


        return count;

    }
}
