package access;

public class BankAccount {

    private int balance;

//    public BankAccount(int balance) {
//        this.balance = balance;
//    }


    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {
        if(isAmount(amount)) {
            balance += amount;
        }
        else {
            System.out.println("유효하지 않는 금액입니다.");
        }
    }

    private boolean isAmount(int amount) {
        return amount > 0;
    }
}
