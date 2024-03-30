//package recursion;

public class printSeq {
    static void rec(int x){
        if(x==6 ){
            return;
        }
       
        System.out.print(x+ " "); 
        rec(x+1);
    }
   public static void main(String[] args) {
    int x =1;
    rec(x);
   }
    

    
}
