import java.util.Scanner;

public class Demo078 {
    public static void main(String[] args) {
        S78 obj = new S78();
        obj.s78();
    }
}

class S78 {
    public void s78() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        rearrangeEvenOdd(arr);

        System.out.println("sorted array");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static void rearrangeEvenOdd(int[] arr) {
        int[] result = new int[arr.length];
        int left = 0, right = arr.length - 1;

        for (int num : arr) {
            if (num % 2 == 0) {
                result[left++] = num;
            } else {
                result[right--] = num;
            }
        }

        System.arraycopy(result, 0, arr, 0, arr.length);
    }
}