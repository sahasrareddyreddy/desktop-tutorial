import java.util.Arrays;

public class Demo064 {
    public static void main(String[] args) {
        int[] arr = { 12, 20, 30, 45, 11 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (n > 2) {
                int temp = arr[0];
                arr[0] = arr[n - 1];
                arr[n - 1] = temp;
                System.out.println("after swapping " + Arrays.toString(arr));
                System.out.println(arr[0] + arr[n - 1]);

                break;
            }
        }
    }
}