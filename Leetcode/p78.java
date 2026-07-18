
package DSA.Leetcode;
import java.util.*;

public class p78 {

    public static void main(String[] args) {

        int []n = {1,2,3};
        System.out.println(subsets(n));

    }
    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        helper(nums, 0, new ArrayList<>(), result);

        return result;
    }
    public static void helper(int[] nums, int idx, List<Integer> ans,List<List<Integer>> result) {

        if (idx == nums.length) {
            result.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[idx]);
        helper(nums, idx + 1, ans, result);

        ans.remove(ans.size() - 1);

        helper(nums, idx + 1, ans, result);
    }

}