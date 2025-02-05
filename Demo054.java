public class Demo054 {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Demo054 obj = new Demo054();
        System.out.println("Sum of two integers: " + obj.add(5, 10));
        System.out.println("Sum of three integers: " + obj.add(3, 7, 2));
        System.out.println("Sum of two double values: " + obj.add(4.5, 2.3));
    }
}
