import java.util.ArrayList;
import java.util.Scanner;

public class Demo078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        for (int e : even) {
            System.out.print(e + " ");
        }
        System.out.print(" | ");
        for (int o : odd) {
            System.out.print(o + " ");
        }
    }
}