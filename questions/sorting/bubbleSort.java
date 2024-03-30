//package sorting;

public class bubbleSort {
    static void sort(int []arr){
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){

                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= temp;
            }
        }
        }

    }
    public static void main(String[] args) {
        int arr[]={1,4,6,2,3,5};
       sort(arr);
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
