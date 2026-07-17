package DSA.recusion;

import com.sun.source.tree.BreakTree;

public class linearSearch {
    public static void main(String[] args) {
        int []arr = {5,7,3,77};
        System.out.println(linear(arr,8,0));
    }
    public static boolean linear(int []arr,int ele,int idx){
        if (idx == arr.length) return false;
        if(arr[idx] == ele){
            return true;
        }
        return linear(arr,ele,idx+1);
    }
}
