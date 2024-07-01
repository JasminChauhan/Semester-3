import java.util.*;

public class LAB_5_32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the  array of String :");
        int n = sc.nextInt();

        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the (" + i + ") element of the array :");
            arr[i] = sc.next();
        }
        String s1 = " ";

        int a = (int) (Math.random() * n);

        for (int i = 0; i < n; i++) {
            if (i == a) {
                s1 = arr[i];
                System.out.println(arr[i] + " ");
                System.out.println(s1 + " ");
            }
        }

        System.out.println("Enter the ANAGRAM of the String :");
        String s2 = sc.next();

        String[] x = new String[s1.length()];
        String[] y = new String[s2.length()];

        for (int i = 0; i < x.length; i++) {
             x[i] = String.valueOf(s1.charAt(i)).toLowerCase();
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = String.valueOf(s2.charAt(i)).toLowerCase();
        }
        
        Arrays.sort(x);
        Arrays.sort(y);

            for (int i = 0; i < y.length; i++) {
                System.out.print(y[i] + " " );
            }
            System.out.println();
            for (int i = 0; i < y.length; i++) {
                System.out.print(x[i] + " " );
            }
            System.out.println();

           boolean flag = Arrays.equals(x, y);

           if(flag == true){
               System.out.println("Anagram");
           }
           else{
               System.out.println("Not an Anagram");
           }
        

    }
}
