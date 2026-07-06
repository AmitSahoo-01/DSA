package DSA.Sorting;

public class binarySearch {
    public static void main(String[] args) {
        int []arr = {3,5,6,9,10,56,344};
        int target = 10;
        int left =0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (arr[mid]==target){
                System.out.println("Found at "+mid);
                return ;
            } else if (arr[mid]<target) {
                left=mid+1;
            }else {
                right = mid-1;
            }
        }
    }
}
