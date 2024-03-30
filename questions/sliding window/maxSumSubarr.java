public class maxSumSubarr {
    static int maxSumSubar(int arr[],int k){
        int windSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            windSum=windSum+arr[i];
        }
        for(int i=k;i<arr.length;i++){
            windSum=windSum -arr[i-k]+arr[i];
            maxSum=Math.max(maxSum,windSum);
        }
        return maxSum;
        }
    public static void main(String[] args) {
        int arr[]={2,9,31,-4,21,7};
        int k=3;
        System.out.println( maxSumSubar(arr, k));
    }
}
