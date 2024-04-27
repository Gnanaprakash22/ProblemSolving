package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MaxSumSubArrayNonContigous {

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];

        int[] arr={10,-2,5,-9};

        System.out.println("sum-->"+findMaxSumOfSubArray(arr));
    }

    public static int findMaxSumOfSubArray(int[] nums) {
        int incl=nums[0];
        int excl=0;
        List<Integer>maxSubArrayIndices=new ArrayList<>();
        maxSubArrayIndices.add(0);

        for(int i=1;i<nums.length;i++){
            int temp=incl;
            if(incl<nums[i]+excl){
                incl=nums[i]+excl;
                maxSubArrayIndices.add(i);
            }
            excl=temp;
        }

        System.out.print("sub array------> ");
        for(int index:maxSubArrayIndices){
            System.out.print(nums[index]+" ");
        }
        System.out.println();

        return incl;
    }

}
