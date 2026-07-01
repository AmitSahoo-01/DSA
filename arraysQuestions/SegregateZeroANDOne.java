package DSA.arraysQuestions;

import java.util.Scanner;

public class SegregateZeroANDOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int []arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //  segregate 0,1
        int left = 0;
        int right = n-1;
        while (left < right){
            if (arr[left] == 0){
                left++;
            } else if (arr[right] == 1) {
                right--;
            }else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("After the sorting:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
