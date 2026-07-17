package DSA.recusion;

public class stairsway {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    public static int climbStairs(int n) {
        if(n==1 || n==2) return n;
        return climbStairs(n-1)+climbStairs(n-2);
    }
}
