package DSA.Sorting;
import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int []arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // selection sort

        for (int j=0;j<n-1;j++) {
            int min = arr[j];
            int minIdx = j;
            for (int i = j; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIdx = i;
                }
            }
            int temp = arr[j];
            arr[j] = arr[minIdx];
            arr[minIdx] = temp;

        }

        System.out.println("Afterre");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
