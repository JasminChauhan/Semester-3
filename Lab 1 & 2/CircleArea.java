import java.util.Scanner;
public class CircleArea{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area = Math.PI*radius*radius;
        System.out.println("Area is = "+area);
        
    }
}