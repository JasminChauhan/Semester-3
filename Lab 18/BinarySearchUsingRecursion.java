import java.util.*;

public class BinarySearchUsingRecursion {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int left = 0;
        int right = n - 1;
        

        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the size of array at index "+ i +": ");
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println("enter the element you want to find : ");
        int key = sc.nextInt();

        int ans = search (a, left, right, key);
        System.out.print ("The Index is at: "+ans);

    }
    public static int search(int a[],int left,int right,int key) {
            int middle = (left + right) / 2;

            if (left <= right) {
                if (a[middle] == key) {
                    return middle;
                } else if (a[middle] < key) {
                    return search (a,middle + 1,right,key);
                } else {
                    return search (a,left,middle - 1,key);
                }
            } else {
                System.out.println("The element is not found");
                return -1;
            }
            
            
    }
}
