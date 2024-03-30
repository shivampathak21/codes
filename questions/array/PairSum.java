 import java.util.*;
 public class PairSum{
    static int PairSum(int []arr, int tar){
        int n= arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==tar){
                    ans++;
                }
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       int n= sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter array");
       for(int i= 0;i<n;i++){
       arr[i]=sc.nextInt();

       }
        int tar=5;
     int result=  PairSum(arr,tar);
     System.out.println(result);
       

    }
}