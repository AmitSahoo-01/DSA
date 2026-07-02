package DSA.arraysQuestions;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class AddingOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int []arr = new int[n];
        Vector<Integer> ans = new Vector<>();
        System.out.println("Enter the elements in the array:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // adding one logic
        int carry =1;
        for (int i =n-1;i>=0;i--){
            if (arr[i]+carry <= 9){
                ans.add(arr[i]+carry);
                carry =0;
            }else{
                ans.add(0);
                carry = 1;
            }
        }
        if (carry == 1){
            ans.add(carry);
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
