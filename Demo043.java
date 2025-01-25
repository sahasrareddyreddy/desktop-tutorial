import java.util.Scanner;
public class Demo043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an uppercase character: ");
        char ch = scanner.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            char lower = (char) (ch + 'a' - 'A');
            System.out.println("Lowercase character: " + lower);
        } else {
            System.out.println("The input is not an uppercase character.");
        }
    }
}