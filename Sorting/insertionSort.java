package DSA.Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int []arr = {2,5,8,98,45,33,2,0};

        for (int i=1;i<arr.length;i++){
            int j=i;
            while(j > 0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        System.out.println("The array after sort");
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
}
