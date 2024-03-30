import java.util.HashSet;

public class unionArr {
    public static int UNION(int arr[],int arr2[]){
     HashSet<Integer> s=new HashSet<>();
     for(int i=0;i<arr.length;i++){
        s.add(arr[i]);
     }
     for(int i=0;i<arr2.length;i++){
        s.add(arr2[i]);
     }

     return s.size();
    }
    public static void main(String[] args) {
        int arr[]={5,10,15,5,10};
        int arr2[]={4,10,15,20,5,10};

        System.out.println(UNION(arr,arr2));
    }
}
