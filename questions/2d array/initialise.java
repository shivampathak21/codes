import java.util.*;
public class initialise{
    static void print (int matrix[][]){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]= new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix [i][j]=sc.nextInt();
            }
        }
        print(matrix);
    }
}
