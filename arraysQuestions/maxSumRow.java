package DSA.arraysQuestions;

public class maxSumRow {
    public static void main(String[] args) {
        int [][]arr = {{13 ,2,3},{3,4,6},{9,8,6}};
        int maxSum = 0;
        int idx = 0;
        for (int i=0;i<arr.length;i++){
            int sum = 0;
            for (int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
                if (sum > maxSum ){
                    maxSum = sum;
                    idx = i;
                }
            }
        }
        System.out.println(idx+" "+maxSum);
    }
}
