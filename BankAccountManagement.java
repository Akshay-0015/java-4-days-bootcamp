class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(String holder, int number, double bal) {

        accountHolder = holder;
        accountNumber = number;
        balance = bal;
    }

    // Deposit method
    void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Amount deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {

        if (balance >= amount) {

            balance = balance - amount;

            System.out.println("Amount withdrawn: " + amount);

        } else {

            System.out.println("Insufficient balance!");
        }
    }

    // Display method
    void displayDetails() {

        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);

        System.out.println("----------------------");
    }
}

public class BankAccountManagement {

    public static void main(String[] args) {

        // Creating two objects
        BankAccount b1 = new BankAccount("Akshay", 101, 5000);
        BankAccount b2 = new BankAccount("Arun", 102, 3000);

        // Depositing money
        b1.deposit(2000);
        b2.deposit(1000);

        // Withdrawing money
        b1.withdraw(1500);

        // Displaying account details
        System.out.println("\nAccount 1 Details:");
        b1.displayDetails();

        System.out.println("Account 2 Details:");
        b2.displayDetails();
    }
}