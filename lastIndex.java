package DSA;
import java.util.*;
public class lastIndex {
    public static void main(String[] args) {
        int l =0;
        int r = l+1;
        int []arr = new int[10];
        while(true){
            for (int i=0;i<r;i++){
                int levenSum = 0;
                int lOddSum = 0;
                if(arr[i]%2==0){
                    levenSum+=arr[i];
                }else{
                    lOddSum+=arr[i];
                }
                for (int j=r;j<arr.length;j++){
                    int revenSum =0;
                    int rOddSum = 0;
                    if(arr[j]%2==0){
                        revenSum+=arr[j];
                    }else{
                        rOddSum+=arr[j];
                    }
                    if (levenSum == rOddSum && lOddSum == revenSum){
                        System.out.println(j);
                        break;
                    }
                }
            }
            System.out.println(-1);
        }
    }
}
