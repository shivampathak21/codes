class searchingInArray{
    public static int search(int arr[],int idx){
        for (int i= 0;i<arr.length;i++){
           if (arr[i]==idx)
               return i;
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={10,4,6,9,2};
        int idx=11;
        System.out.println(search(arr,idx));
    }
}