package id.ac.polinema;

public class Account {
    private String accountNumber;
    private Customer owner; // ganti String ke tipe Customer
    private double balance;

    public Account(String accountNumber, Customer owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getOwner() { // getter mengembalikan tipe data Customer
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void printInfo() {
        //nama pemilik diambil dari method owner.getName()
        System.out.println(accountNumber + " - " + owner.getName() + " - balance: " + balance);
    }
}
