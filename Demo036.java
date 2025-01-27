import java.util.Scanner;
class Demo036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another num: ");
        int num2 = sc.nextInt();
        System.out.println("Enter another num: ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1+" "+"is Bigger");
        }else if (num2 > num1 && num2 > num3){
            System.out.println(num2+" "+"is Bigger");
        }else {
            System.out.println(num3+" "+"is Bigger");
        }
    }
}