package leetcode;

import java.util.Scanner;

public class MaxSumSubArray {

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];

        int[] arr={10,2,-5,-9};

        System.out.println("sum-->"+findMaxSumOfSubArray(arr));
    }

    public static int findMaxSumOfSubArray(int arr[]){
        int currMax=arr[0];
        int maxSoFar=arr[0];
        int start=0;
        int end=0;
        int currentStart=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<currMax+arr[i]){
                currMax=currMax+arr[i];
            }else {
                currMax=arr[i];
                currentStart=i;
            }
//            currMax=Math.max(arr[i],currMax+arr[i]);

            if(maxSoFar<currMax){
                maxSoFar=currMax;
                start=currentStart;
                end=i;
            }
//            maxSoFar=Math.max(currMax,maxSoFar);
        }

        System.out.println("sub array");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        return maxSoFar;
    }

}
