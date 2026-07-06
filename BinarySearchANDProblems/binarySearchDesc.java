package DSA.BinarySearchANDProblems;

public class binarySearchDesc {
    public static void main(String[] args) {
        int []arr = {100,45,20,7,2,0};
        int target = 20;
        int left =0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (arr[mid]==target){
                System.out.println("Found at "+mid);
                return ;
            } else if (arr[mid]<target) {
                right=mid-1;
            }else {
                left = mid+1;
            }
        }
    }
}
