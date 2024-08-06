import java.util.*;

class Bubblesort {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i< arr.length;i++) {
            System.out.println("enter the size of array at index "+ i +": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i< arr.length;i++) {
            System.out.print(arr[i]+",");
        }
    }
}