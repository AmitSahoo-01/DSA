package DSA.BinarySearchANDProblems;

public class floorSortedArr {
    public static void main(String[] args) {
        int []arr = {1,2,4,10,10,12,19};
        int target = 11;
        int left = 0;
        int right = arr.length-1;
        int idXocc = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if (arr[mid]>target){
                right = mid-1;
            }else if (arr[mid]<target){
                idXocc = mid;
                left = mid+1;
            }else{
                System.out.println("target found at index - "+mid);
                return;
            }
        }
        System.out.println("Target nearest smallest integer - "+arr[idXocc]+"and index is "+idXocc);
    }
}
