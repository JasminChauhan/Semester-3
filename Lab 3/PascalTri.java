import java.util.*;

public class PascalTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal Triangle: ");
        int numRows = sc.nextInt();
        
        for (int i = 0; i < numRows; i++) {
            int number = 1;
            System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
