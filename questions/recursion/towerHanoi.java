public class towerHanoi{
    static void towerofHanoi(int n,char src,char help,char dest){
      if(n==1){
        System.out.println("Move disk 1 from " + src + " to "+ dest  );
        return;
      }
      towerofHanoi(n-1, src,dest, help );
      System.out.println("Move disk "+ n+" from "+src+ " to "+dest);
      towerofHanoi(n-1,help, src,dest );

    }
    public static void main (String[] args){
       int n= 3;
       char src='s';
       char help='h';
       char dest='d';
       System.out.println("Move of tower of hanoi with "+n+"diks");

       towerofHanoi(n,src,help,dest);

    }
}