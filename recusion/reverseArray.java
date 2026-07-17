package DSA.recusion;

public class reverseArray {
    public static void main(String[] args) {
        int []arr = {2,3,4,9,78,90,5,6};
        revArr(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
    public static void revArr(int []arr,int i,int j){
        if(i>j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        revArr(arr,i+1,j-1);
    }
}
