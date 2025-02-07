import java.util.Scanner;

public class LTcode009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();
        int[] nums1 = new int[size1];
        System.out.println("Enter elements of first sorted array: ");
        for (int i = 0; i < size1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();
        int[] nums2 = new int[size2];
        System.out.println("Enter elements of second sorted array: ");
        for (int i = 0; i < size2; i++) {
            nums2[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        double median = sol.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median of merged sorted arrays: " + median);

        sc.close();
    }
}

class sloution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int mergedSize = m + n;
        int[] merged = new int[mergedSize];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < m) {
            merged[k++] = nums1[i++];
        }
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        if (mergedSize % 2 == 1) {
            return merged[mergedSize / 2];
        } else {
            int mid1 = merged[mergedSize / 2 - 1];
            int mid2 = merged[mergedSize / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}