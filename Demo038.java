import java.util.Scanner;
class Demo038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        char  character= sc.next().charAt(0);
        if (Character.isLowerCase(character)) {
            System.out.println("entered character is in lowercase");
        } else {
            System.out.println("entered character is in Uppercase");
        }
    }
}