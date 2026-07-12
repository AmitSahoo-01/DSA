package DSA.Leetcode;

public class p1331 {
    public static void main(String[] args) {

        int []arr = {89,899,90,56};
        int []ans = arrayRankTransform(arr);
        System.out.println(ans);
    }

        public static int[] arrayRankTransform(int[] arr) {

            int n = arr.length;
            int[] ans = new int[n];

            for (int i = 0; i < n; i++) {
                int rank = 1;

                for (int j = 0; j < n; j++) {

                    if (arr[j] < arr[i]) {

                        boolean duplicate = false;

                        for (int k = 0; k < j; k++) {
                            if (arr[k] == arr[j]) {
                                duplicate = true;
                                break;
                            }
                        }

                        if (!duplicate) {
                            rank++;
                        }
                    }
                }

                ans[i] = rank;
            }

            return ans;
        }

}
