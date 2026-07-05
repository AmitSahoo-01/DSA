package DSA.Sorting;

import java.util.ArrayList;

public class unionArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int []brr = {2,4,6,8};
        int i=0;
        int j=0;
        ArrayList<Integer>ans = new ArrayList<>();
        while(i<arr.length && j<brr.length){
            if (arr[i]==brr[j]){
                ans.add(arr[i]);
                i++;
                j++;
            } else if (arr[i]<brr[j]) {
                ans.add(arr[i]);
                i++;
            } else if (arr[i]>brr[j]) {
                ans.add(brr[j]);
                j++;
            }
        }
        while(i<arr.length){
            ans.add(arr[i]);
            i++;
        }
        while(j<brr.length){
            ans.add(brr[j]);
            j++;
        }
        System.out.println(ans);
    }
}
