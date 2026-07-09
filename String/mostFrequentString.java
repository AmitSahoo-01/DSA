package DSA.String;

public class mostFrequentString {
    public static void main(String[] args) {
        String s = "character";
        int maxFreq = -1;
        char ans = s.charAt(0);
        for (int i =0;i<s.length();i++){
            int freq = 0;
            char ch = s.charAt(i);
            for (int j=i+1;j<s.length();j++){
                if (s.charAt(j)==ch){
                    freq++;
                }
            }
            if (freq > maxFreq){
                maxFreq = freq;
                ans = ch;
            } else if (freq >= maxFreq && ch < ans) {
                ans = ch;
            }
        }
        System.out.println(ans);
    }
}
