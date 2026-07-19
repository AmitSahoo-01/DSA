package DSA.Sorting;

public class cyclic {
    public static void main(String[] args) {
        int []arr = {0,2,1,4,8,5,7,6,3};
        cyclicSort(arr);
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }

    private static void cyclicSort(int[] arr) {
        int i=0;
        int n = arr.length;
        while (i<n){
            if(arr[i] == i){
                i++;
            }else{
                int ele = arr[i];
                int temp = arr[i];
                arr[i] = arr[ele];
                arr[ele] = temp;
            }
        }
    }
}
