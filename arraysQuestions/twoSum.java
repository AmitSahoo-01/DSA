package DSA.arraysQuestions;

import java.util.Scanner;

public class twoSum {
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

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j] == target){
                    System.out.println("The index are: "+i+" and "+j);
                    break;
                }
            }
        }
    }
}
