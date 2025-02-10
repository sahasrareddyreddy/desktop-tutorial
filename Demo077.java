import java.util.Arrays;
import java.util.Scanner;

public class Demo077 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] sourceArray = new int[size];
        int[] destinationArray = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            sourceArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            destinationArray[i] = sourceArray[i];
        }

        System.out.println("Elements of the destination array: " + Arrays.toString(destinationArray));

        scanner.close();
    }
}