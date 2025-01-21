public class Demo026 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        char[] chars = input.toLowerCase().toCharArray();
        int vowels = 0, consonants = 0;
        char[] vowelsArray = {'a', 'e', 'i', 'o', 'u'};

        for (char c : chars) {
            if (c >= 'a' && c <= 'z') {
                if (new String(vowelsArray).indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);
    }
}