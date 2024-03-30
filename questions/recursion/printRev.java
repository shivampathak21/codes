//package recursion;

public class printRev {
    static void recursion(int x){
        if(x==0) return ;
        System.out.print(x);
        recursion(x-1);
    }
    
    
    public static void main(String[] args) {
        int x=5;
       recursion(x);
    }
}
