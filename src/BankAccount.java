public class BankAccount {

    private int accountNumber = 0;
    private double accountBalance = 0.0d;
    private String customerName = "";
    private String customerEmail = "";
    private String customerPhone = "";

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void depositFund (double depositAmount) {

        accountBalance += depositAmount;
        System.out.println(depositAmount + " deposited. Current balance: " + accountBalance + ".");
    }

    public void withdrawFund (double withdrawAmount) {

        if (withdrawAmount > accountBalance) {
            System.out.println("Insufficient fund. Your current balance: " + accountBalance);
        } else {
            accountBalance -= withdrawAmount;
            System.out.println(withdrawAmount + "withdraw processed. Current balance: " + accountBalance);
        }


    }
}
