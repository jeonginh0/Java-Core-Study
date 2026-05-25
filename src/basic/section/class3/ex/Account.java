package basic.section.class3.ex;

public class Account {
    int balance;

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("입금 완료. 입급금액: " + amount + "원, 계좌잔액: " + balance + "원");
    };

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다. 출금금액: " + amount + "원, 계좌잔액: " + balance + "원");
        } else {
            balance = balance - amount;
            System.out.println("출금 완료. 출금금액: " + amount + "원, 계좌잔액: " + balance + "원");
        }
    }

    public void getBalance() {
        System.out.println("계좌 잔액: " + balance + "원");
    }

}
