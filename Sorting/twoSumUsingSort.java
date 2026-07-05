package DSA.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class twoSumUsingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the values of the array:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // two sum
        System.out.println("Enter the target:");
        int target = sc.nextInt();

        Arrays.sort(arr);

        int i=0;int j=n-1;
        while (i<j){
            if(arr[i]+arr[j] < target){
                i++;
            } else if (arr[i]+arr[j]>target) {
                j--;
            } else if (arr[i]+arr[j]==target) {
                System.out.println("The index are: "+i+" and "+j);
                break;
            }else {
                System.out.println("There is no doublet.");
            }
        }

    }
}
