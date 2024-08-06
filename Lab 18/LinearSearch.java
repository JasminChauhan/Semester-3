import java.util.*;

public class LinearSearch{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i< arr.length;i++){
            System.out.println("enter the size of array at index "+ i +": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element you want to find : ");
        int key = sc.nextInt();

        for(int i = 0; i< arr.length;i++){
           if(arr[i] == key){
                System.out.println("Index is at "+i);
           } 
        }
    }
}