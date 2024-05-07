public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void depositFunds(double depositAmount) {

        this.balance += depositAmount;
        System.out.println("Deposit of $ : " + depositAmount + " made. " + getBalance());
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (getBalance() - withdrawalAmount < 0 ) {
            System.out.println("Insuficiente Funds, you have Only $ : " + getBalance() + " in your account ");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("withdral of $" + withdrawalAmount + " processed, Reimaining balance = $" + getBalance());
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
