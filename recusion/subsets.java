package DSA.recusion;
import java.util.*;
public class subsets {
    public static void main(String[] args) {
        String s = "abc";
        List<String > ls = new ArrayList<>();
        sunsets("",s,0,ls);
        Collections.sort(ls);
        System.out.println(ls);
    }
    public static void sunsets(String ans,String s,int idx,List<String>ls){
        if(idx == s.length()){
            ls.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        sunsets(ans+ch,s,idx+1,ls);
        sunsets(ans,s,idx+1,ls);
    }
}
