import java.util.Scanner;

public class Demo083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        sc.close();

        if (str.length() > 0) {
            char firstChar = str.charAt(0);
            if ("aeiou".indexOf(firstChar) != -1) {
                System.out.println("The first character is a vowel.");
            } else if (Character.isLetter(firstChar)) {
                System.out.println("The first character is a consonant.");
            } else {
                System.out.println("The first character is not a letter.");
            }
        } else {
            System.out.println("Empty string entered.");
        }
    }
}
