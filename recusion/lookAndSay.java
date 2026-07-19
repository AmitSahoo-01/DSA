package DSA.recusion;

public class lookAndSay {
    public static void main(String[] args) {
        String s = "111000221111";

//        int n = s.length();
//        int i=0;
//        int j=0;
//        String ans = "";
//        while(j<n){
//            if (s.charAt(i) == s.charAt(j)){
//                j++;
//            }else {
//                int count = j - i;
//                ans += count;
//                ans = ans + s.charAt(j - 1);
//                i = j;
//            }
//        }
//        int count = j-i;
//        ans+=count;
//        ans+=s.charAt(i);
//        System.out.println(ans);
        int n = s.length();
        int i=0;
        String ans ="";
        while(i<n){
            int j=i;
            while(j<n && s.charAt(i) == s.charAt(j)){
                j++;
            }
            int count = j-i;
            ans+=count;
            ans+=s.charAt(i);
            i=j;
        }
        System.out.println(ans);
    }
}
