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

        // Accept customer information
        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter deposit amount (whole number): ");
        int deposit = input.nextInt();

        System.out.print("Enter annual interest rate (%): ");
        double interestRate = input.nextDouble();

        // Create Customer object
        Customer customer =
                new Customer(name, deposit, interestRate);

        // Calculate interest and total savings
        double interest = customer.calculateInterest();
        double totalSavings = customer.calculateTotal();

        // Automatic type conversion: int to double
        double depositAsDouble = deposit;

        // Manual type conversion: double to int
        int truncatedInterest = (int) interest;

        // Proper rounding for accounting
        double roundedInterest = Math.round(interest * 100.0) / 100.0;
        double roundedTotalSavings =
                Math.round(totalSavings * 100.0) / 100.0;

        // Customer savings report
        System.out.println();
        System.out.println("=================================");
        System.out.println("     CUSTOMER SAVINGS REPORT");
        System.out.println("=================================");

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Deposit: " + customer.getDeposit());
        System.out.printf("Interest Rate: %.2f%%%n",
                customer.getInterestRate());

        System.out.printf("Calculated Interest: %.2f%n",
                roundedInterest);

        System.out.printf("Total Savings: %.2f%n",
                roundedTotalSavings);

        // Type conversion demonstration
        System.out.println();
        System.out.println("=================================");
        System.out.println("       TYPE CONVERSION DEMO");
        System.out.println("=================================");

        System.out.println("Original deposit (int): "
                + deposit);

        System.out.println("Deposit converted to double: "
                + depositAsDouble);

        System.out.printf("Original interest (double): %.3f%n",
                interest);

        System.out.println("After manual (int) conversion: "
                + truncatedInterest);

        System.out.printf("After rounding to 2 decimal places: %.2f%n",
                roundedInterest);

        System.out.println();
        System.out.println("Accuracy note: manual conversion from double "
                + "to int removes the decimal part, while rounding "
                + "preserves the nearest accounting value.");

        input.close();
    }
}