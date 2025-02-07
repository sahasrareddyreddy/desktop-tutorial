public class Demo067 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.print("even elements are ");
        for (int i = 2; i < arr.length; i = i + 2) {
            System.out.println(i);
        }
    }
};