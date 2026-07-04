package DSA.Sorting;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //  Bubble Sorting

        for (int i=0;i<=n-1;i++){
            int swap = 0;
            for (int j=0;j<n-1;j++){
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if (swap == 0) break;
        }

        System.out.println("After sorting");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
