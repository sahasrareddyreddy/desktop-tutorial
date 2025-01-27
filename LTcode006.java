import java.util.Scanner;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int k = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; 
                k++;
            }
        }
        
        return k; 
    }
}

public class LTcode006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (sorted in non-decreasing order):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
      
        Solution solution = new Solution();
        int k = solution.removeDuplicates(nums);
        
        
        System.out.print("Number of unique elements: " + k + ", nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");
        
        scanner.close();
    }
}