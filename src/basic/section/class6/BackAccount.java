package basic.section.class6;

public class BackAccount {

    private int balance;

    public BackAccount() {
        this.balance = 0;
    }

    // public 메서드 입금(deposit)
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드 출금(withdraw)
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드 잔액확인(getBalance)
    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함.
        return amount > 0;
    }
}
