import java.util.Scanner;
class Demo037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second num: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third num: ");
        int num3 = sc.nextInt();
        System.out.println("Enter fourth num: ");
        int num4 = sc.nextInt();
        if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println(num1+" "+"is Bigger");
        }else if (num2 > num1 && num2 > num3 && num2 > num4){
            System.out.println(num2+" "+"is Bigger");
        }else if (num3 > num1 && num3 > num2 && num3 > num4){
            System.out.println(num3+" "+"is Bigger");
        }else {
            System.out.println(num4+" "+"is Bigger");
        }
    }
}