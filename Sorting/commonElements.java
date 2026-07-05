package DSA.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class commonElements {
    public static void main(String[] args) {
        int []arr = {3,4,2,2,4};
        int []brr = {3,2,2,7};

        ArrayList<Integer>ans = new ArrayList<>();

        Arrays.sort(arr);
        Arrays.sort(brr);

        int i=0;
        int j = 0;
        while(i<arr.length && j<brr.length){
            if (arr[i]==brr[j]){
                ans.add(arr[i]);
                i++;
                j++;
            }else if (arr[i]<brr[j]){
                i++;
            }else if (arr[i] > brr[j]){
                j++;
            }
        }

        System.out.println(ans);
    }
}
