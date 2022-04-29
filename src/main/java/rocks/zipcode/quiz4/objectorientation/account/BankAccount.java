package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    private double bal;

    public void setBalance(Double bal) {
    this.bal = bal;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy > 0) {
            this.bal = this.bal + amountToIncreaseBy;
        }else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {

        if (amountToDecreaseBy > 0 && amountToDecreaseBy <= this.bal) {

            this.bal = this.bal - amountToDecreaseBy;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Double getBalance() {
        return this.bal;
    }
}
