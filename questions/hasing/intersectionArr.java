import java.util.HashSet;

public class intersectionArr {
    public static int inter(int arr[],int arr2[]){
        int count =0;
        HashSet<Integer> s=new HashSet<>();
        for( int num:arr){
            s.add(num);
        }
        
        for(int num:arr2)
        if(s.contains(num)){
            count++;
            s.remove(num);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={5,10,15,5,10};
        int arr2[]={4,10,15,20,5,10};

        System.out.println(inter(arr,arr2));
    }
}
