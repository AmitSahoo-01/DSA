package DSA.Leetcode;

public class p443 {
    public static void main(String[] args) {
        char[] arr = {'a','a','b','b','c','c','d'};


        System.out.println(compress(arr));

    }
    public static int compress(char[] chars) {
        int i =0;
        int write = 0;
        while(i<chars.length){
            int j = i;
            while(j<chars.length && chars[i] == chars[j]){
                j++;
            }
            chars[write] = chars[i];
            write++;
            int count = j-i;
            if(count > 1){
                String cnt = String.valueOf(count);
                for (char ch : cnt.toCharArray()){
                    chars[write] = ch;
                    write++;
                }
            }
            i = j;

        }
        return write;
    }
}
