import java.util.Scanner;
class Demo035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another num: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1+" "+"is Bigger than"+" "+num2);
        }else if (num2 > num1){
            System.out.println(num2+" "+"is Bigger than"+" "+num1);
        }else {
            System.out.println("Enter proper digits");
        }
    }
}