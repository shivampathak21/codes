import java.util.*;

public class tripletSum {
    static int triplet(int arr[],int target){
        int ans=0;
        int n= arr.length;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                   if( arr[i]+arr[j]+arr[k]==target){
                    ans++;
                   }

                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
      System.out.println("enter num of array elemnts");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter array");
       for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();

       }

       int target=12;
       int result= triplet(arr,target);
       System.out.println(result);

    }
}
