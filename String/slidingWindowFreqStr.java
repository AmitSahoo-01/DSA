package DSA.String;

import java.util.Arrays;

public class slidingWindowFreqStr {
    public static void main(String[] args) {
        String s = "character";
        int Maxfreq = 1;
        char ans = s.charAt(0);
        char []arr = s.toCharArray();
        Arrays.sort(arr);
        int i=0,j=0;
        while(j<s.length()){
            if (arr[i] == arr[j]) j++;
            else {
                int freq = j-i;
                if (freq>Maxfreq){
                    Maxfreq = freq;
                    ans = arr[i];
                }
                i=j;
            }
        }
        int freq = j-i;
        if (freq>Maxfreq){
            Maxfreq = freq;
            ans = arr[i];
        }

        System.out.println(ans);

       
    }
}
