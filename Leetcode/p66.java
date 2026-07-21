package DSA.Leetcode;

public class p66 {
    public static void main(String[] args) {
        int []arr = {1,3,4};
        System.out.println(plusOne(arr));
    }
    public static int[] plusOne(int[] digits) {

        // Last digit se start karo
        for (int i = digits.length - 1; i >= 0; i--) {

            // Agar digit 9 se chhota hai to usme 1 add karke return kar do
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // Agar digit 9 hai to 0 bana do aur carry aage jayega
            digits[i] = 0;
        }

        // Agar loop yahan tak aa gaya, matlab saare digits 9 the
        // Jaise: [9,9,9] -> [1,0,0,0]
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }
}
