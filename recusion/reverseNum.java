package DSA.recusion;

public class reverseNum {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(revNum(n,0));
    }
    public static int revNum(int num,int rev){

        if(num==0) return rev;
        return revNum(num/10,rev*10+num%10);
    }
}
