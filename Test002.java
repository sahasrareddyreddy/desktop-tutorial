import java.util.Scanner;

public class Test002 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter your reply (yes/no): ");
                
                if (scanner.next().equalsIgnoreCase("yes")) {
                    System.out.println("Happy Pongal!");
                    break;
                } else if (scanner.next().equalsIgnoreCase("no")) {
                    System.out.println("Error");
                    break;
                
            }
        }
    }
}
}
