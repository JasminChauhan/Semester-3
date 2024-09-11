public class CountingSort {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }  
        }
        
        int []arr1 = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            arr1[arr[i]]++;
        }
        
        for (int i = 1; i < arr1.length; i++) {
            arr1[i] += arr1[i - 1];
        }
        
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            result[--arr1[arr[i]]] = arr[i];
        }
       
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
