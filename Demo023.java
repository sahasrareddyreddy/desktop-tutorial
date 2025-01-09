public class Demo023 {
    public static int isPalindrome(int x) {
        if (x <= 0) {
            return -1;
        }
        int original = x;
        int reversed = 0;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return (original == reversed) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(232));
        System.out.println(isPalindrome(345));
        System.out.println(isPalindrome(-5));
    }
}
