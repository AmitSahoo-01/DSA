package DSA.recusion;

public class mergeSorting {
    public static void main(String[] args) {
        int []arr = {1,76,43,22,-34,-5,0,3,43,2,2,4,6,66};
        mergeSort(arr);
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n==1) return;
        //step-1 divide in 2 array.
        int []a = new int[n/2];
        int []b = new int[n-n/2];
        // step-2 put values in array.
        int idx = 0;
        for (int i=0;i<a.length;i++){
            a[i] = arr[idx];
            idx++;
        }
        for (int j=0;j<b.length;j++){
            b[j] = arr[idx];
            idx++;
        }
        
        // step-3 sorting 2 array.
        mergeSort(a);
        mergeSort(b);
        //step-4 sorting a,b array in arr array
        merge(a,b,arr);
    }

    private static void merge(int[] a, int[] b, int[] arr) {
        int i=0;
        int j=0;
        int k=0;

        while (i<a.length && j<b.length){
            if (a[i]<=b[j]){
                arr[k] = a[i];
                k++;
                i++;
            }else {
                arr[k] = b[j];
                k++;
                j++;
            }
        }
        while (i<a.length){
            arr[k] = a[i];
            i++;
            k++;
        }
        while (j<b.length){
            arr[k] = b[j];
            j++;
            k++;
        }
    }
}
