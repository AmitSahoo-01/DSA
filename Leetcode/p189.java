package DSA.Leetcode;

import java.util.Scanner;

public class p189 {
    public static void reverse(int []arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {1,2,3,4,5,6,7};
        System.out.println("Enter the kth number or you want top rotate the array:");
        int k = sc.nextInt();
        rotate(arr,k);
        for (int nums : arr){
            System.out.print(nums+" ");
        }
    }
}
