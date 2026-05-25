package basic.section.class3.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();

        // 입금 (10,000 원)
        account.deposit(10000);

        // 출금 (-9,000 원)
        account.withdraw(9000);

        // 출금 (-2,000 원)
        account.withdraw(2000); // 실패 문구 출력

        // 현재 잔액 확인
        account.getBalance();
    }

}
