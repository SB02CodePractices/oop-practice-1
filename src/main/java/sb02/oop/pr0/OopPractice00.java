package sb02.oop.pr0;

public class OopPractice00 {

    public static void main(String[] args) {
        System.out.println("Hello, Payment!");

        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(5000);
        creditCardPayment.cancel(500);

        Payment accountTransferPayment = new AccountTransferPayment();
        accountTransferPayment.pay(2000);
        accountTransferPayment.cancel(2000);
    }

}
