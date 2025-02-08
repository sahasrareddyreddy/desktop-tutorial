public class Demo071 {
    public static void main(String[] args) {
        int[] arr = { 10, 3, 5, 8, 13, 17, 20, 23 };

        System.out.println("Given array");
        printArray(arr);

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("\n reversed array");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}