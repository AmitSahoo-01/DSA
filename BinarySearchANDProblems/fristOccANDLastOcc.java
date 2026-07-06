package DSA.BinarySearchANDProblems;

public class fristOccANDLastOcc {
    public static void main(String[] args) {
        int []arr = {2,3,4,4,4,4,4,8,90,122};
        int target = 4;
        int left = 0;
        int right = arr.length-1;
        int fIdx = -1;
        int lIdx = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if (arr[mid]==target){
                fIdx = mid;
                right = mid-1;
            } else if (arr[mid]<target) {
                left=mid+1;
            }else {
                right = mid-1;
            }
        }
        left =0;
        right = arr.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if (arr[mid]==target){
                lIdx = mid;
                left = mid+1;
            } else if (arr[mid]<target) {
                left=mid+1;
            }else {
                right = mid-1;
            }
        }
        System.out.println("The frist occ - "+fIdx+"AND The last occ - "+lIdx);
    }
}
