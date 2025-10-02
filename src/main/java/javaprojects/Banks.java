package javaprojects;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Banks {
    private static void menu(){
        System.out.println("\n0:Exit1, 1:New Account,2:Deposit,3:Withdraw,4:View,5:View All");
    }
    
    public static void main(String[] args)throws ClassNotFoundException, InvalidAgeException, InvalidMobileNumberException, NegativeNumberException, NumberFormatException, InsufficientAmountException{
        Scanner s;
        s = new Scanner(System.in);
        Utilities.readAccounts();
        Map<String,BankAccounts> accounts = Utilities.getAccounts(); 
        
        while(true){
            int option=-1;
            menu();
            System.out.print("Enter your choice : ");
            option = Integer.parseInt(s.nextLine());
            
            switch(option){
                case 0 -> {
                    try{
                        Utilities.writeAccounts();
                        System.out.println("Thank you");
                        return;
                    }catch(IOException ex){
                        System.out.println(ex);
                    }
                }
                    
                case 1 -> {
                    try{
                        BankAccounts account = new BankAccounts();
                        if(accounts.containsKey(account.getAccountno())) {
                            System.out.println("Account number already exists!");
                        } else {
                            accounts.put(account.getAccountno(), account);
                            System.out.println("Account created successfully.");
                        }
                    }catch(NumberFormatException | InvalidAgeException | InvalidMobileNumberException | NegativeNumberException ex){
                        System.out.println(ex);
                    }
                }
                    
                case 2 -> {
                    try{
                        System.out.print("Enter the account number : ");
                        String accountnumber = s.nextLine();
                        BankAccounts accountsObj = Utilities.getBankAccount(accountnumber);
                        accountsObj.deposit(); 
                        System.out.println("Updated account: " + accountsObj);
                    }catch(NumberFormatException | AccountNotFoundException | NegativeNumberException ex){
                        System.out.println(ex);
                    }
                } 
                case 3 -> {
                    try{
                        System.out.print("Enter the account number: ");
                        String accountnumber = s.nextLine();
                        BankAccounts account = Utilities.getBankAccount(accountnumber);
                        account.withdraw();
                        System.out.println("Updated account: " + account);
                    }catch(NumberFormatException | AccountNotFoundException | InsufficientAmountException | NegativeNumberException ex){
                        System.out.println(ex);
                    }
                }  
                case 4 -> {
                    try{
                        System.out.print("Enter the account number : ");
                        String accountnumber = s.nextLine();
                        BankAccounts account = Utilities.getBankAccount(accountnumber);
                        System.out.println(account);
                    }catch(AccountNotFoundException ex){
                        System.out.println(ex);
                    }
                }

                    
                case 5 -> {
                    System.out.println("\nAll Accounts:\n");
                    for(BankAccounts acc : accounts.values())
                        System.out.println(acc);
                    System.out.println();
                }
            }
        }
    }
}
