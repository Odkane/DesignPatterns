package behavioral.chainofresponsibility;

public abstract class Account {
    float balance;
    Account successor;

    public Account(float balance) {
        this.balance = balance;
    }

    public void setSuccessor(Account successor) {
        this.successor = successor;
    }

    boolean canPay(float amount){
        return  this.balance >= amount;
    }

    public void pay(float amount) {
        if (this.canPay(amount)) {
            this.balance -= amount;
            System.out.printf("The amount %.2f€ is paid with the %s Account\n", amount, this.getClass().getSimpleName());
            System.out.printf("New balance of your %s account is %.2f\n", this.getClass().getSimpleName(), balance);
        } else if (null != successor) {
            System.out.printf("The amount %.2f€ cannot be paid with the %s account\n",
                    amount, this.getClass().getSimpleName());
            System.out.printf("Trying with the %s account... \n", successor.getClass().getSimpleName());
            successor.pay(amount);
        } else
            System.out.printf("The amount %.2f€ cannot be paid with any of your accounts \n",amount);
    }
}
