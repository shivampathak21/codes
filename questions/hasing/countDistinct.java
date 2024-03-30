import java.util.HashSet;

public class countDistinct{
    public static int countdistinct(int arr[]){
        HashSet <Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);

        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr[]={5,10,15,5,4,5};

      System.out.println(countdistinct(arr));

    }
}