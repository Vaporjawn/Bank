package javaapplication24;

import javax.swing.JOptionPane;

/**
 *
 * @author todoslosdays
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog(null, "How many accounts are there?");
        int numberOfAccounts = Integer.parseInt(input);
        BankAccount Bank [] = new BankAccount [numberOfAccounts];
        int n = 0;
        
        
        
        String out = (String) JOptionPane.showInputDialog(null, "Select an action", "",
                JOptionPane.QUESTION_MESSAGE,null, new Object[] { "Add Bank Account", "Search for Bank Account", "Deposit",
                    "Withdraw", "Exit"}, "Add Bank Account");
                
        while(!out.equals("Exit")){
            
            if(out.equals("Add Bank Account")){
                
                String userAccountNumber = JOptionPane.showInputDialog(null, "Enter new account number");
                
                
                String input2 = JOptionPane.showInputDialog(null, "Enter the balance of this account");
                double userAccountBalance = Double.parseDouble(input2);
                if (userAccountBalance <= 0){
                    System.out.println("Information was entered incorrectly");
                    System.out.println("No Object will be created");
                    System.exit(0);
                }
                
                String userAccountName = JOptionPane.showInputDialog(null, "Enter the name of the account holder");
                
                n = n;
                BankAccount Account = new BankAccount (userAccountNumber, userAccountBalance, userAccountName);
                Bank [n] = Account;
                //Bank[0] = new BankAccount;
                n++;
                
            }
            
            
            
            if(out.equals("Search for Bank Account")){
                
                String accountNumberInput = JOptionPane.showInputDialog(null, "Please enter the bank account number that you are looking for");
                
                
            }
            if(out.equals("Deposit")){
                
                String userDepositInput = JOptionPane.showInputDialog(null, "Please enter the amount you wish to deposit");
                double depositInput = Double.parseDouble(userDepositInput);
                Bank[n].deposit(depositInput);
                
                
            }
            if (out.equals("Withdraw")){
                String userWithdrawalInput = JOptionPane.showInputDialog(null, "Please enter the amount you wish to withdraw");
                double withdrawalInput = Double.parseDouble(userWithdrawalInput);
                Bank[n].withdraw(withdrawalInput);
                
            }
            if (out.equals("Exit")){
                
                System.out.println("Okay");
                System.exit(0);
                
            }
            
            Bank[n].printReport();
            
        out = (String) JOptionPane.showInputDialog(null, "Select an Action", "", 
                JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Add Bank Account", "Search for Bank Account", "Deposit",
                    "Withdraw", "Exit"}, "Add Bank Account");
    }
        
     
}}


class BankAccount{
    
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    
    private static int numberOfAccounts;
    
    public void deposit(double amount){
        if (amount > 0){
          balance = balance + amount;  
        }
    }
    public void withdraw(double amount){
        if (balance - amount > 0){
            balance = balance - amount;
        }
        
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    public String getAccounHolderName(){
        return accountHolderName;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void printReport(){
        System.out.println(accountNumber + " " + accountHolderName + " " + balance);
    }
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    BankAccount (String accountNumber, double balance, String accountHolderName) {
        this.setAccountNumber(accountNumber); this.deposit(balance); this.setAccountHolderName(accountHolderName); numberOfAccounts++;
    }
    BankAccount(String accountNumber, String accountHolderName){
        new BankAccount("0000", "No Name");
    }
    public void printErrorMessage(){
        System.out.println("Information was entered incorrectly");
        System.out.println("No Object will be created");
    }
}