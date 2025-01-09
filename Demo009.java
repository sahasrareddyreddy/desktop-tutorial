import java.util.Scanner;

public class Demo009 {
    String cust_name = "Sahasra";
    long Account_no = 123456;
    Double balance = 100000.00;

    void accept_details() {
        System.out.println("Enter your name and account number:");
        Scanner sc = new Scanner(System.in);
        cust_name = sc.nextLine();
        Account_no = sc.nextLong();
    }

    void Display_details() {
        System.out.println("Hello " + cust_name);
        System.out.println("Your balance is " + balance);
    }

    public static void main(String[] args) {
        Demo009 obj = new Demo009();
        obj.accept_details();
        obj.Display_details();
    }
}
