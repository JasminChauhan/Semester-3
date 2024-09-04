public class CountingSort {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int max = arr[0];
        
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                max = arr[i];
            }  
        }
        int []arr1 = new int[max];

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr1.length; j++) {
                if (arr1[j] == i) {
                    arr1[i]++;
                }
            }
        }
        int sum = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            sum += arr1[i];
            arr1[i] = sum;
        }
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 1; j < arr1.length; j++) {
                if (arr[i] == j) {
                    result[arr1[j]] = arr[i];
                }   
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
