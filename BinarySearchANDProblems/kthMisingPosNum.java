package DSA.BinarySearchANDProblems;

public class kthMisingPosNum {
    static  int kthMissing(int[] arr,int k){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            int correctNo = mid+1;
            int missing = arr[mid] - correctNo;
            if (missing >= k){
                right = mid - 1;
            }else {
                left = mid+1;
            }
        }
        return left+k;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int k = 3;

        int ans = kthMissing(arr,k);
        System.out.println(ans);

    }
}
