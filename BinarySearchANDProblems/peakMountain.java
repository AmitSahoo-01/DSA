package DSA.BinarySearchANDProblems;

public class peakMountain {
    public static void main(String[] args) {
        int []arr = {0,1,0};
        int left =0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                System.out.println("Found at "+mid);
                return ;
            } else if (arr[mid]< arr[mid-1]) {
                left=mid+1;
            }else {
                right = mid-1;
            }
        }
    }
}
