class sumOfArray{
     static int sum(int arr[]){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans=arr[i]+ans;

        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= { 1,3,2,4};
        int result= sum(arr);
        System.out.println(result+" :this is sum");


    }
}