import java.util.*;

public class HE001 {
    public static void findMexPrefix(int[] arr) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        int mex = 0;

        for (int num : arr) {
            seen.add(num);
            while (seen.contains(mex)) {
                mex++;
            }
            result.add(mex);
        }

        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        findMexPrefix(arr);
    }
}
