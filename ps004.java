class Client {
    private final double basePay;
    private int hoursWorked;

    public Client(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    public Client(double basePay) {
        this.basePay = basePay;
    }

    public void computeSalary() {
        if (basePay < 8.0 || hoursWorked > 60) {
            System.out.println("Error");
            return;
        }
        double totalPay = hoursWorked <= 40 ? basePay * hoursWorked : (basePay * 40) + ((hoursWorked - 40) * basePay * 1.5);
        System.out.printf("Total Pay: $%.2f%n", totalPay);
    }

    public static void main(String[] args) {
        new Client(7.50, 35).computeSalary();
        new Client(8.20, 47).computeSalary();
        new Client(10.00, 3).computeSalary();
    }
}
