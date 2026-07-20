package DSA.Leetcode;

public class p268 {
    // This is for 0-based indexing and array numbers from 1 to n and solved by cyclic sort.
    public static void main(String[] args) {
        int []arr = {3,2,4,7,5,6,1};
        System.out.println(misingNum(arr));
    }
    public static int misingNum(int[] arr){
        int n = arr.length+1;
        int i=0;
        
        while(i<arr.length){
            if(arr[i]==i+1 || arr[i] == n){
                i++;
            }else{
                int idx = arr[i]-1;
                swap(arr,i,idx);
            }
        }
        for (i=0;i<arr.length;i++){
            if (arr[i]!=i+1) return i+1;
        }
        return n;
    }
    public static void swap(int[] arr,int i,int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
