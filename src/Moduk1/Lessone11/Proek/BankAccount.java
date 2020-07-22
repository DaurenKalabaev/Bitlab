package Moduk1.Lessone11.Proek;

public interface BankAccount {
    String getAccountNumber();
    String getPinCode();
    public void setPinCode(String pinCode);
    int totalBalance();
    public void creditBalance(int credit);
    public void debetBalance(int debet);
    String accountData();


}

