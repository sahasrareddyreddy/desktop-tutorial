import java.util.Scanner;
public class Demo024 {
    public static int isPalindrome(int x) {
        if (x <= 0) {
            return -1;
        }
        int original = x;
        int reversed = 0;
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(isPalindrome(number));
    }
}
