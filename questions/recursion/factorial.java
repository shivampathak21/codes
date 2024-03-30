//package recursion;

public class factorial {
    static int recu(int x){
        if(x==0 || x==1){
            return 1;
        }
        int fac= recu(x-1);
        int result= x*  fac;
        return result;
    }
      
    public static void main(String[] args) {
        int x=5;
       int a= recu(x);
        System.out.print(a);
    }
    
}
