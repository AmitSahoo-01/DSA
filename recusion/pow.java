package DSA.recusion;

import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = sc.nextInt();
        System.out.println("Entre the value of b");
        int b = sc.nextInt();

        System.out.println(powRe(a,b));
        System.out.println(powS(a,b));
    }
    public static int powRe(int a,int b){
        if(b==0) return 1;
        int power = powRe(a,b/2);
        if(b%2 == 0){
            return power*power;
        }else{
            return power*power*a;
        }
    }
    public static int powS(int a ,int b){
        if(b==0) return 1;

        return a*powS(a,b-1);
    }
}
