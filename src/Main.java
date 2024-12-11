//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(12345678);
        bankAccount.setAccountBalance(1000.00);
        bankAccount.setCustomerName("Prosenjit Mondal");
        bankAccount.setCustomerEmail("prosenjit.mondal@gmail.com");
        bankAccount.setCustomerPhone("+447336459227");

        bankAccount.withdrawFund(1200.00);
        bankAccount.depositFund(500.00);
        bankAccount.withdrawFund(1200.00);
    }
}