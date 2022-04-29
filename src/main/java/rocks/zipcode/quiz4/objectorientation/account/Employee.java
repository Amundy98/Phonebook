package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Transactable, Worker {
    BankAccount bankAccount;
    Double balance;
    Double hoursWorked;
    Double hourlyWage;
    Double MoneyEarned;



    public Employee() {
        this.hoursWorked = 0.0;
        this.hourlyWage = 35.0;
        this.balance = 0.0;
        this.bankAccount = new BankAccount(); //make an employee and checking to se if bank account. when we make an employee we're also making a new bank account.



    }

    public Employee(BankAccount bankAccount) {
        this.balance = 15.0;
        this.hoursWorked = 0.0;
        this.hourlyWage = 35.0;
        this.bankAccount = bankAccount;
    }



    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAccount.deposit(amountToIncreaseBy);

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
//        this.balance = bankAccount.getBalance() - amountToDecreaseBy;
        bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked += numberOfHours;

    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return this.hourlyWage * this.hoursWorked;
    }
}
