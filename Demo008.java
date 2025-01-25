import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = "";
        String pwd = "";
        String reply;

        do {
            System.out.println("Hello, welcome to Malla Reddy University");
            System.out.println("Have you visited our site earlier?");
            reply = sc.nextLine();

            if (reply.equalsIgnoreCase("no")) {
                System.out.println("Login here");
                System.out.println("Enter your ID and password:");
                loginid = sc.nextLine();
                pwd = sc.nextLine();
            } else {
                System.out.println("You are our valued customer");
            }

        } while (loginid.equals("Sahasra") && pwd.equals("123456"));

        System.out.println("Thank you for logging in!");
    }
}