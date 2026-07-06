package DSA.BinarySearchANDProblems;

public class maxCountArr {
    public static void main(String[] args) {
        int []arr = {-2,-1,-1,1,2,3};
        int pos = 0;
        int neg =0;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if (arr[mid]<0) {
                neg= mid+1;
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        left = 0;
        right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if (arr[mid] > 0) {
                pos = arr.length - mid;
                right = mid - 1;   // aur left side check karo
            } else {
                left = mid + 1;
            }
        }
        if (pos>neg){
            System.out.println("The positive integer is more"+pos);
        }else if (pos<neg){
            System.out.println("Negative"+neg);
        }else{
            System.out.println("sama samw"+pos);
        }
    }
}
