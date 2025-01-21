public class Demo024A {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};
        String[] phoneNumbers = {"123-456-7890", "987-654-3210", "456-789-1230", "789-123-4560", "321-654-9870"};
        String[] addresses = {"123 Koti", "456 sec", "789 hyd", "101 ameerpet", "202 mru hstl"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Phone: " + phoneNumbers[i]);
            System.out.println("Address: " + addresses[i]);
            System.out.println();
        }
    }
}