import java.util.Scanner;

public class Demo070 {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Prime numbers in the array: ");
        boolean foundPrime = false;
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                foundPrime = true;
            }
        }
        if (!foundPrime) {
            System.out.print("None");
        }
        scanner.close();
    }
}
