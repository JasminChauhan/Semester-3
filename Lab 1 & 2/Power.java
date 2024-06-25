import java.util.Scanner;
public class Power{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 1;
        for(int i=1;i<=y;i++){
            ans = ans*x;
        }
        System.out.println("Power is = "+ans);
    }
}