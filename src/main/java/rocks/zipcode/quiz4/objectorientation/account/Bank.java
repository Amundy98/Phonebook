package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private ArrayList<BankAccount> bankAccounts;

    public Bank() {
        this.bankAccounts = new ArrayList<>();
    }

    public void removeBankAccountByIndex(Integer indexNumber) {
        int myInt = (int) indexNumber;
         bankAccounts.remove(myInt);

    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
       boolean hasIt = true;
       if (bankAccounts.contains(bankAccount)){
           return hasIt;
       }

        return false;
    }

    public ArrayList<BankAccount> getBankAccount() {
        return bankAccounts;
    }

    public void setBankAccount(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
