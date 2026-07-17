package DSA.recusion;

public class fristOcc {
    public static void main(String[] args) {

        int []arr = {1,1,1,2,3,4};
        System.out.print(firstSearch( arr,0,arr.length,1));
    }
    public static int firstSearch(int[] arr, int left, int right, int k) {

        if (left > right)
            return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == k) {

            int ans = firstSearch(arr, left, mid - 1, k);

            if (ans == -1)
                return mid;

            return ans;

        } else if (arr[mid] > k) {

            return firstSearch(arr, left, mid - 1, k);

        } else {

            return firstSearch(arr, mid + 1, right, k);
        }
    }
}
