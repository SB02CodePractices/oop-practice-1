package sb02.oop.pr3;

public class PaymentService {

    public void processPayment(UserAccount account, double amount) {
        try {
            account.withdraw(amount);
        } catch (IllegalArgumentException e) {
            // 다른 처리 로직
            throw new RuntimeException(e);
        }

        // 그 외 결제 관련된 로직
        System.out.println("결제 서비스: 계좌 [" + account.getAccountId() + "]에 대해 " + amount + "원 겔제 완료.");
    }

    public void processRefund(UserAccount account, double amount) {
        try {
            account.deposit(amount);
        } catch (IllegalArgumentException e) {
            // 다른 처리 로직
            throw new RuntimeException(e);
        }

        // 그 외 환불 관련된 로직
        System.out.println("결제 서비스: 계좌 [" + account.getAccountId() + "]에 대해 " + amount + "원 환불 완료.");
    }
}
