import java.util.HashSet;
import java.util.Scanner;

public class Demo031 {
    public static void main(String[] args) {
        HashSet<Object> hashset = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        hashset.add(name);

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        hashset.add(rollNumber);

        System.out.print("Enter class: ");
        int studentClass = scanner.nextInt();
        hashset.add(studentClass);

        System.out.print("Enter section: ");
        String section = scanner.next();
        hashset.add(section);

        System.out.println("Hashset with heterogeneous data:");
        System.out.println(hashset);
    }
}