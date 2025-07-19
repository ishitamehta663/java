
 import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {3,5,100};
        waveArray(arr);
        System.out.println("Wave form array: " + Arrays.toString(arr));
    }

    public static void waveArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i += 2) {
            
            if (i > 0 && arr[i] < arr[i - 1]) {
                swap(arr, i, i - 1);
            }

            
            if (i < n - 1 && arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
