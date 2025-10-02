package javaprojects;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Utilities {

    private static Map<String, BankAccounts> accounts;

    public static void writeAccounts() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.txt"));
        out.writeObject(accounts);
        out.flush();
        out.close();
    }

    public static Map<String, BankAccounts> getAccounts() {
        return accounts;
    }

    // अब getNewAccountNo() random नहीं है
    public static String getNewAccountNo() {
        return null; // अब user input से account number assign करेंगे
    }

    public static void readAccounts() throws ClassNotFoundException {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.txt"));
            accounts = (Map<String, BankAccounts>) in.readObject();
            in.close();
        } catch (IOException ex) {
            System.out.println(ex);
            accounts = new TreeMap<String, BankAccounts>();
        }
    }

    public static BankAccounts getBankAccount(String accountnumber) throws AccountNotFoundException {
        BankAccounts account = accounts.get(accountnumber);
        if (account == null) {
            throw new AccountNotFoundException();
        }
        return account;
    }
}
