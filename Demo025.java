public class Demo025 {
    public static void main(String[] args) {
        String input = "Hello all happy sankranthi";
        char[] charArray = input.toCharArray();
        char[] reversedArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            reversedArray[i] = charArray[charArray.length - 1 - i];
        }

        String reversed = new String(reversedArray);
        System.out.println("Reversed String: " + reversed);
    }
}