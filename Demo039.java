import java.util.Scanner;
public class Demo039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char character = sc.next().charAt(0);
        if (Character.isLowerCase(character)){
            System.out.println("Entered character is in lower case");
        }else if (Character.isUpperCase(character)){
            System.out.println("Entered character is in Upper case");
        }else if (Character.isDigit(character)){
            System.out.println("Entered character is a digit");
        }else {
            System.out.println("Enter a character or a digit");

        }
    }
}