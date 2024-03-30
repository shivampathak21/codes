public class joseph {
    static int jooseph(int people,int k){
        if(people==1) return 0;
        return (( jooseph(people-1, k) +k) % people );
    }
    public static void main(String[] args) {
        int people=5;
        int k=3;
       System.out.println( jooseph(people,k));
    }
    
}
