public class Demo074 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}