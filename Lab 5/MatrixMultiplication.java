import java.util.*;
public class MatrixMultiplication {
    public static void main(String []args){
        int [][]a = new int[3][2];
        int [][]b = new int[2][3];
        int [][]ans = new int[3][3]; 
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ;i<3;i++){
            for(int j = 0;j<2;j++){
                System.out.println("enter the value in Matrix 1 at " + i + " and" +j);
                a[i][j] = sc.nextInt();
            } 
        }
        for(int i = 0;i<2;i++){
            for(int j = 0;j< 3;j++){
                System.out.println("enter the value in Matrix 2 at "  + i + " and" +j);
                b[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<3;i++){
            for(int j = 0 ;j<3;j++){
                int sum = 0;
                for(int k = 0;k<2;k++){
                    sum += a[i][k] * b[k][j];
                }
                ans[i][j] = sum;
                System.out.print(ans[i][j]+ "\t");
            }
            System.out.println();
        }
                
       }       
    }
