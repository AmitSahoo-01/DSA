package DSA.Leetcode;

public class p451 {
    public static void main(String[] args) {
        String s = "AAmmIIttt";
        System.out.println(duplicateSort(s));
    }
    public static String duplicateSort(String s){
        int n = s.length();
        int[] freq = new int[128];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
        }
        int maxFreq = 0;
        for (int j=0;j<freq.length;j++){
            maxFreq = Math.max(maxFreq,freq[j]);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = maxFreq;i>=1;i--){
            for (int j=0;j<128;j++){
                if (freq[j] == i){
                    for (int k=0;k<i;k++){
                        ans.append((char)(j));
                    }
                }
            }
        }
        return ans.toString();
    }
}
