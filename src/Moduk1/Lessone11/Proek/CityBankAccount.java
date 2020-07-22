package Moduk1.Lessone11.Proek;

public class CityBankAccount implements BankAccount{

   private String name;
   private String surname;
   private int balance;
   private String accountNumber;
   private String pincode;


   public CityBankAccount(){

   }

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pincode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pincode = pincode;
    }


    public String getName() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
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
        return totalBalance();
    }

    @Override
    public void creditBalance(int credit) {

    }

    @Override
    public void debetBalance(int debet) {

    }

    @Override
    public String accountData() {
        return "CityBankAccount{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';

    }
}
