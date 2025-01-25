import java.util.Scanner;

public class Demo007 {
    public static void main(String[] args) {
        String name;
        int age;
        String phno;

        System.out.println("Please enter your name, age, and phone number:");
        Scanner sc = new Scanner(System.in);

        name = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine();
        phno = sc.nextLine();

        System.out.println("Hello " + name + ", your age is " + age + ", and your phone number is " + phno);
    }
}

    
