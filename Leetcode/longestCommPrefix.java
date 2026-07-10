package DSA.Leetcode;
//String s = "Amit";
//        for (int i=0;i<s.length();i++){
//        for (int j=i+1;j<=s.length();j++){
//        System.out.print(s.substring(i,j)+" ");
//        }
//        }
public class longestCommPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    System.out.println("");
                    return;
                }
            }
        }

        System.out.println(prefix);
    }
}
