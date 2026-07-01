package DSA.arraysQuestions;

import java.util.Scanner;

public class waveArray {
    public static void waveArrayAns(int []arr,int n){
        n = arr.length;
        for (int i=0;i<n-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();;
        }
        waveArrayAns(arr,n);
    }
}
   //  [1,2,3,4,5]
   //   [2,1,4,3,5]