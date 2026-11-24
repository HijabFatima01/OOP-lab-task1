
import java.util.Scanner;

class Bankaccount {

    // Data Members
    String Holdername;
    long Accountnumber;
    double Balance;

    static Scanner sc = new Scanner(System.in);


    // Constructor 1: Default Constructor
    Bankaccount() {

        System.out.print("Enter Holder Name: ");
        Holdername = sc.nextLine();

        System.out.print("Enter Account Number: ");
        Accountnumber = sc.nextLong();

        System.out.print("Enter Balance: ");
        Balance = sc.nextDouble();
        sc.nextLine();
    }


    // Constructor 2: Parameterized Constructor
    Bankaccount(String name, long accnum, double initialbalance) {

        Holdername = name;
        Accountnumber = accnum;
        Balance = initialbalance;
    }


    // Check Balance
    void checkBalance() {
        System.out.println("Current Balance: $" + Balance);
    }


    // Deposit Money
    void deposit(double amount) {

        if (amount > 0) {
            Balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + Balance);
        }
        else {
            System.out.println("Invalid Deposit Amount!");
        }
    }


    // Withdraw Money
    void withdraw(double amount) {

        if (amount > 0 && amount <= Balance) {
            Balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Remaining Balance: $" + Balance);
        }
        else if (amount > Balance) {
            System.out.println("Insufficient Balance!");
        }
        else {
            System.out.println("Invalid Amount!");
        }
    }


    // Display Account Details
    void display() {

        System.out.println("\n--- Account Details ---");
        System.out.println("Holder Name: " + Holdername);
        System.out.println("Account Number: " + Accountnumber);
        System.out.println("Balance: $" + Balance);
    }
}


// Main Class
public class Banksystem {

    public static void main(String[] args) {

        // Object 1: Default Constructor
        System.out.println("--- Account 1 ---");

        Bankaccount s1 = new Bankaccount();

        s1.display();
        s1.deposit(700);
        s1.checkBalance();


        // Object 2: Parameterized Constructor
        System.out.println("\n--- Account 2 ---");

        Bankaccount s2 = new Bankaccount("Ali", 226010L, 500);

        s2.display();
        s2.withdraw(200);
        s2.checkBalance();


        
    }

   
}
