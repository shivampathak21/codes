import java.util.*;
public class maxInArr {
    int max(int arr[]){
        int ans=0;
        for (int i=0;i<=arr.length;i++){
           if  ( arr[i]>ans){
                 ;
           }
            ans++;
        }


    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("enter array elements");
       for (int i=0;i<=arr.length ;i++){
        arr[i]= sc.nextInt();

       }
       int result=max(arr);
       System.out.println(max);
 
    }
}
