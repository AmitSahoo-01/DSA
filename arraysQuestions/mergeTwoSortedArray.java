package DSA.arraysQuestions;
import java.util.*;
public class mergeTwoSortedArray {
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

        int []mergeArr = new int[m+n];

        int i=0;
        int j =0;
        int k =0;
        while (i < n && j < m ){
            if (arr[i]<=brr[j]){
                mergeArr[k] = arr[i];
                i++;
                k++;
            }else{
                mergeArr[k] = brr[j];
                j++;
                k++;
            }
        }
        if (i < arr.length){
            while (i<n){
                mergeArr[k] = arr[i];
                i++;
                k++;
            }
        }else{
            while(j<m){
                mergeArr[k] = brr[j];
                j++;
                k++;
            }
        }


        System.out.println("After sorting:");
        for (int h=0;h<mergeArr.length;h++){
            System.out.print(mergeArr[h]+" ");
        }

    }
}
