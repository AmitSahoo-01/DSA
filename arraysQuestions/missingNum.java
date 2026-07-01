package DSA.arraysQuestions;

import java.util.Scanner;

public class missingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the values of the aaray:");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int sumArray = (n+1)*(n+1+1)/2 ;
        int sum = 0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("The missing number in the array :"+(sumArray-sum));
    }
}
