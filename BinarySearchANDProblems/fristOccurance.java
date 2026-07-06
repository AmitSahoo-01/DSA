package DSA.BinarySearchANDProblems;

public class fristOccurance {
    public static void main(String[] args) {
        int []arr = {3,5,6,9,9,9,9,9,10,56,344};
        int target = 9;
        int left =0;
        int right = arr.length-1;
        int occ = -1;
        while (left<=right){
            int mid = (left+right)/2;
            if (arr[mid]==target){
                occ = mid;
                right = mid-1;
            } else if (arr[mid]<target) {
                left=mid+1;
            }else {
                right = mid-1;
            }
        }
        System.out.println(occ);
    }
}
