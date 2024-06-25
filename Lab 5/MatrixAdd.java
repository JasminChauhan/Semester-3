import java.util.*;
public class MatrixAdd {
   public static void main(String []args){
        int [][]a = new int[2][2];
        int [][]b = new int[2][2];
        int [][]ans = new int[2][2]; 
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.println("enter the value in Matrix 1 at " + i + " and" +j);
                a[i][j] = sc.nextInt();

                System.out.println("enter the value in Matrix 2 at "  + i + " and" +j);
                b[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ;i<2;i++){
            for(int j = 0;j<2;j++){
                ans[i][j] = a[i][j] + b[i][j];
                System.out.print(ans[i][j]+"\t");
            }
            System.out.println();
        }
   }
}
