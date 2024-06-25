import java.util.*;
public class InsertNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();
        int []a = {1,2,3,4};
        int []b = new int[5];
        int n = sc.nextInt();
        for(int i = 0; i < a.length; i++){
            if(i < idx){
                b[i] = a[i];
            }
            else if(i == idx){
                b[i] = n;
            }
            else {
                b[i+1] = a[i];
            }
        }
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}