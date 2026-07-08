package DSA.String;

public class palindrome {
    public static void main(String[] args) {
        String s = "hello";
        int i = 0;
        int j = s.length();
        String rev = "";
        for (i=j-1;i>=0;i--){
            rev = rev +s.charAt(i);
        }
        System.out.println(rev);
    }
}
