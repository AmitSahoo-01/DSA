package DSA.arraysQuestions;
import java.util.*;
public class segregateOfZeroOneTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int i=0;
        int j =0;    //  0,0,1,2,0,2
        int k=0;
        Vector<Integer>ans = new Vector<>();
        for (int t=0;t<=n-1;t++){
            if (arr[t]<arr[t+1]){
                int temp = arr[t];
                arr[t] = arr[t+1];
                arr[t] = temp;
            }
        }

        System.out.println("Sfter sorting");
        for (int l=0;l<n;l++){
            System.out.print(arr[l]+" ");
        }
    }
}
