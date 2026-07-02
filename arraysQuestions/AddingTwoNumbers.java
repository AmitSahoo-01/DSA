package DSA.arraysQuestions;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class AddingTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 1st array:");
        int n = sc.nextInt();
        System.out.println("Enter the size of the 2nd array:");
        int m = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the 1st array:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int []brr = new int[m];
        System.out.println("Enter the elements of the 2nd array:");
        for (int i=0;i<m;i++){
            brr[i] = sc.nextInt();
        }

        Vector <Integer> ans = new Vector<>();

        //  adding numbers
        //   2 3 4
        //   4 5 6
        // ====
        //   6 9 0

       int i= n-1;
       int j = m-1;
       int carry =0;
       while (i>=0 || j>=0 || carry != 0){
           int sum = carry;

           if(i >= 0){
               sum+=arr[i];
               i--;
           }

           if(j >= 0){
               sum += brr[j];
               j--;
           }

           ans.add(sum%10);
           carry = sum/10;

       }

       Collections.reverse(ans);
        System.out.println(ans);

    }
}
