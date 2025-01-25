import java.util.Scanner;
public class Demo042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase character: ");
        char ch = scanner.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            char upper = (char) (ch - 'a' + 'A');
            System.out.println("Uppercase character: " + upper);
        } else {
            System.out.println("The input is not a lowercase character.");
        }
    }
}