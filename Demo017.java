package Core_Java;

class SumOf2Digits {
    public static int getSumOf2Digits(int n) {
        int fd = n / 10;
        int ld = n % 10;
        return fd + ld;
    }
}

public class Demo017 {
    public static void main(String[] args) {
        int n = 78;
        int sum = SumOf2Digits.getSumOf2Digits(n);
        System.out.println("The sum of 2 digits is: " + sum);
    }
}
