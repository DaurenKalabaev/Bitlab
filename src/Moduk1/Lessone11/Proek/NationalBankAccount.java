package Moduk1.Lessone11.Proek;

public class NationalBankAccount implements BankAccount {
    private String fullName;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public NationalBankAccount(){

    }

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    @Override
    public String getAccountNumber() {
        return null;
    }

    @Override
    public String getPinCode() {
        return null;
    }

    @Override
    public void setPinCode(String pinCode) {

    }

    @Override
    public int totalBalance() {
        return 0;
    }

    @Override
    public void creditBalance(int credit) {

    }

    @Override
    public void debetBalance(int debet) {

    }

    @Override
    public String accountData() {
        return null;
    }
}
