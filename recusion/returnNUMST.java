package DSA.recusion;

public class returnNUMST {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countAndSay(n));
    }
    public static String countAndSay(int n) {

        if (n == 1) {
            return "1";
        }

        // Previous row
        String prev = countAndSay(n - 1);

        // Current row generate
        return generate(prev);
    }

    public static String generate(String s) {

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            int j = i;

            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                j++;
            }

            int count = j - i;

            ans.append(count);
            ans.append(s.charAt(i));

            i = j;
        }

        return ans.toString();
    }
}
