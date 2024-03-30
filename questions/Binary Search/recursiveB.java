public class recursiveB{
    public static int binary(int arr[],int key,int low,int high){
        if(low>high) return -1;
        int mid= (low+high)/2;
        if(arr[mid]==key) return mid;
        if(key> arr[mid]){
            return     binary(arr,key,mid+1,high);
        }
        else{
           return   binary(arr, key, low,mid-1);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,6,8,9,11};
        int key= 11;
        int low=0;
        int high=arr.length-1;
        System.out.println(binary( arr,key,low,high));

    }
}