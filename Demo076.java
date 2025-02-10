import java.util.Scanner;

public class Demo076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second maximum.");
        } else {
            System.out.println("The second maximum number is: " + secondMax);
        }

        scanner.close();
    }
}
