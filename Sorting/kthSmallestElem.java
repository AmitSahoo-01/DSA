package DSA.Sorting;

public class kthSmallestElem {
    public static void main(String[] args) {
        int []arr = {5,3,9,0,19};
        int k = 1;

        //  kth smallest element
        for (int i=0;i<k;i++){
            int min = arr[i];
            int minIdx = i;
            for (int j=i;j<arr.length;j++){
                if (arr[j]<min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        System.out.println("The array");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("The kth smallest value is - "+arr[k-1]);
    }
}
