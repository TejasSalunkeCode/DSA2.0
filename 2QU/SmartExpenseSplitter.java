// Smart Expense Splitter Project
// Demonstrates OOP concepts: Encapsulation, Inheritance, Polymorphism, Exception Handling

import java.util.*;

// -----------------------------
// Custom Exception Class
// -----------------------------
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// -----------------------------
// Base Class
// -----------------------------
class Person {
    private String name;      // Encapsulated variable
    private double balance;   // Encapsulated variable

    // Constructor
    public Person(String name) {
        this.name = name;
        this.balance = 0;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Method to update balance
    public void updateBalance(double amount) {
        balance += amount;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println(name + " Balance: " + balance);
    }
}

// -----------------------------
// Derived Class (Inheritance)
// -----------------------------
class PremiumPerson extends Person {

    public PremiumPerson(String name) {
        super(name);
    }

    // Method Overriding
    @Override
    public void displayDetails() {
        System.out.println("Premium User -> " + getName() +
                           " Balance: " + getBalance());
    }
}

// -----------------------------
// Expense Manager Class
// -----------------------------
class ExpenseManager {
    private List<Person> members = new ArrayList<>();

    // Add member
    public void addMember(Person person) {
        members.add(person);
    }

    // Add expense and split equally
    public void addExpense(double amount, Person payer) 
            throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                "Amount must be greater than zero");
        }

        if (members.size() == 0) {
            System.out.println("No members available.");
            return;
        }

        double share = amount / members.size();

        for (Person p : members) {
            if (p != payer) {
                p.updateBalance(-share);
            }
        }

        payer.updateBalance(amount - share);
    }

    // Display all balances
    public void displayBalances() {
        for (Person p : members) {
            p.displayDetails();
        }
    }
}

// -----------------------------
// Main Class
// -----------------------------
public class SmartExpenseSplitter {

    public static void main(String[] args) {

        ExpenseManager manager = new ExpenseManager();

        // Creating objects (Runtime Polymorphism)
        Person p1 = new Person("Amit");
        Person p2 = new PremiumPerson("Tejas");

        manager.addMember(p1);
        manager.addMember(p2);

        try {
            // Normal execution
            manager.addExpense(1000, p1);
            manager.displayBalances();

            // Exception case
            manager.addExpense(-500, p2);

        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}