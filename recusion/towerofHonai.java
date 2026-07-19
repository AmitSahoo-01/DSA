package DSA.recusion;

public class towerofHonai {
    public static void main(String[] args) {
        honai(3,'a','b','c');
    }

    private static void honai(int n, char a, char b, char c) {
        //  a- srouce
        // b- helper
        // c - destination
        if (n==0) return;
        honai(n-1,a,c,b);
        System.out.println(a+"->"+c);
        honai(n-1,b,a,c);
    }
}
