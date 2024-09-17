public class ShellSort {

    public static void main(String[] args) {
        int a[] = {1, 4, 65, 7, 4};
        int n = a.length;

        for (int gap = n / 2; gap >= 1; gap /= 2) {
            for (int j = gap; j < n; j++) {
                for (int i = j - gap; i >= 0; i -= gap) {
                    if (a[i + gap] >= a[i]) {
                        break; 
                    }else {
                        int temp = a[i + gap];
                        a[i + gap] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
