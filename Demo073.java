import java.util.HashSet;
import java.util.Set;

public class Demo073 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 4};
        Set<Integer> elements = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!elements.add(num)) {
                duplicates.add(num);
            }
        }

        for (int duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}