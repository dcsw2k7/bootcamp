import java.util.List;
import java.util.LinkedList;

public class Bank {
    private List<Account> accounts;
    private String address;
    
    public Bank() {
        this.accounts = new LinkedList<>();
    }

    public void add(Account account) {
        accounts.add(account);
    }

    private static void creditAccount(double amount) {
        new Account().credit(amount);
    }


    public static class Account {  // private ?
      private static int number = 0;
      private int acctNo;
      private double balance;

      public Account() {
        this.acctNo = ++number;
      }
    }   

    public int getAcctNo() {
      return this.acctNo;
    }
  
    public void credit(double amount) {
      this.balance += amount;
    }

    public void print() {
        // this.address;  // you cannot access the outer class instance variable n static nested class
        // because Account and Bank are in 
    }

    public static void main(String[] args) {
        
    }
}
