public class Tugas2A {
    // Inner class BankAccount
    public static class BankAccount {
        private int accountNumber;
        private double balance;
        private String customerName;
        private String customerEmail;
        private String customerPhone;

        // Constructor
        public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.customerName = customerName;
            this.customerEmail = customerEmail;
            this.customerPhone = customerPhone;
        }

        // Getter and Setter for accountNumber
        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        // Getter and Setter for balance
        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        // Getter and Setter for customerName
        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        // Getter and Setter for customerEmail
        public String getCustomerEmail() {
            return customerEmail;
        }

        public void setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
        }

        // Getter and Setter for customerPhone
        public String getCustomerPhone() {
            return customerPhone;
        }

        public void setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
        }

        // Method to deposit
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        }

        // Method to withdraw
        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Error: Saldo tidak mencukupi");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: $" + balance);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        // Membuat objek BankAccount
        BankAccount myAccount = new BankAccount(20042002, 1000.0, "John Doe", "john.doe@email.com","081234789056" );

        // Menampilkan informasi awal
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        // Melakukan deposit
        myAccount.deposit(500.0);

        // Melakukan withdraw
        myAccount.withdraw(600.0);

        // Melakukan withdraw dengan saldo tidak mencukupi
        //myAccount.withdraw(1500.0);
    }
}
