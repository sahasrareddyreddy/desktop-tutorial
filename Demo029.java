import java.util.Scanner;
public class Demo029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of friend " + (i + 1) + ": ");
            friends[i] = scanner.nextLine();
        }

        System.out.println("\nFriends' Names:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}