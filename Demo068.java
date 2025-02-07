public class Demo068 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        int count = 1;
        System.out.print("count of even elements: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(count++ + " ");
            }
        }
    }
}