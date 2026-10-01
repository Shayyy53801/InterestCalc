import java.util.Scanner;

class Customer {
    private String name;
    private int deposit;
    private double interestRate;

    public Customer(String name, int deposit, double interestRate) {
        this.name = name;
        this.deposit = deposit;
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return deposit * interestRate / 100;
    }

    public double calculateTotal() {
        return deposit + calculateInterest();
    }

    public String getName() {
        return name;
    }

    public int getDeposit() {
        return deposit;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter deposit amount: ");
        int deposit = input.nextInt();

        System.out.print("Enter annual interest rate (%): ");
        double interestRate = input.nextDouble();

        Customer customer =
                new Customer(name, deposit, interestRate);

        double interest = customer.calculateInterest();
        double totalSavings = customer.calculateTotal();

        // Automatic type conversion: int to double
        double depositAsDouble = deposit;

        // Manual type conversion: double to int
        int truncatedInterest = (int) interest;

        // Rounding
        long roundedInterest = Math.round(interest);

        System.out.println();
        System.out.println("=================================");
        System.out.println("     CUSTOMER SAVINGS REPORT");
        System.out.println("=================================");

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Deposit: " + customer.getDeposit());
        System.out.println("Interest Rate: "
                + customer.getInterestRate() + "%");
        System.out.println("Calculated Interest: " + interest);
        System.out.println("Total Savings: " + totalSavings);

        System.out.println();
        System.out.println("=================================");
        System.out.println("      TYPE CONVERSION DEMO");
        System.out.println("=================================");

        System.out.println("Original deposit (int): " + deposit);
        System.out.println("Deposit converted to double: "
                + depositAsDouble);

        System.out.println("Original interest (double): "
                + interest);

        System.out.println("After manual (int) conversion: "
                + truncatedInterest);

        System.out.println("After Math.round(): "
                + roundedInterest);

        input.close();
    }
}