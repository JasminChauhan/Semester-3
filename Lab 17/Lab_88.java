
import java.util.Arrays;
import java.util.Scanner;

public class Lab_88 {
    static int[] hashTable = new int[20];
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the elements in array at index "+ i);
            arr[i] = sc.nextInt();
        }
        store(arr);

        System.out.println(Arrays.toString(hashTable));

    }
    public static void store(int[] arr) {
        
        for(int i = 0; i < arr.length; i++) {
            int index = hashFunction(arr[i]);

            hashTable[index] = arr[i];
        }

    }

    public static int hashFunction(int y) {
        int index = (y % 18) + 2;

        if(hashTable[index] != 0) {
            while(hashTable[index] != 0) {
                index = (++index) % 20;
            }
        }
        return index;
    } 
}