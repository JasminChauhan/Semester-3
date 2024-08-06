import java.util.*;
public class BinarySearch {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int left = 0;
        int right = n - 1;
        int middle = 0;

        for(int i = 0; i < a.length;i++) {
            System.out.println("enter the size of array at index "+ i +": ");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("enter the element you want to find : ");
        int key = sc.nextInt();

        while(left <= right) {
            middle = (left + right) / 2;

            if(a[middle] == key){
                System.out.println("Index is at "+ middle);
                break;
            } else if (a[middle] < key) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
    }
}