package leetcode.medium;

import java.util.Arrays;

public class ArrayRotateLeft {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr,int d){
       //3 4 5 6 7 8 1 2
        d=d% arr.length;
        reverse(arr,0,d-1);//2,1,3,4,5,6,7,8
        reverse(arr,d, arr.length-1);//2,1,8,7,6,5,4,3
        reverse(arr,0,arr.length-1);//3,4,5,6,7,8,1,2
    }

    private static void reverse(int[] arr,int start,int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
