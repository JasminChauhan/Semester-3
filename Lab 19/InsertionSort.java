import java.util.*;
public class InsertionSort {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the size of array at index "+ i +": ");
            a[i] = sc.nextInt();
        }
        
        int i = 1;
        int j;
        int key;
        while (i < n) {
            key = a[i];
            j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
            i++;
        }
        for (int k = 0; k< a.length;k++) {
            System.out.print(a[k]+",");
        }


    }
}