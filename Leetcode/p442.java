package DSA.Leetcode;
import java.util.*;
public class p442 {
    public static void main(String[] args) {
        int []arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] arr) {
        List <Integer> ans = new ArrayList<>();
        cyclicSort(arr,ans);
        return ans;
    }
    public static void cyclicSort(int[] nums,List <Integer> ans) {
        int i = 0;

        while (i < nums.length) {

            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
            }
        }
    }
}
