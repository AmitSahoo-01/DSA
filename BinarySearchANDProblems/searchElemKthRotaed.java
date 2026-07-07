package DSA.BinarySearchANDProblems;
import java.util.*;
public class searchElemKthRotaed {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,0,1,2};
        int target = 1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index : " + mid);
                return;
            }

            // Left half sorted
            if (arr[left] <= arr[mid]) {

                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            }

            // Right half sorted
            else {

                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
        }

        System.out.println("Not Found");
    }
}
