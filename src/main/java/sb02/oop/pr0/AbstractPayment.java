package sb02.oop.pr0;

public abstract class AbstractPayment implements Payment {

    protected void validatePayAmount(double amount) {
        if (amount <= 100) {
            throw new IllegalArgumentException("결제 금액이 100원이 안되는게 말이되냐?");
        }
    }

    protected void validateCancelAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("취소 금액이 0원이 안되는게 말이되냐?");
        }
    }

    @Override
    public abstract void pay(double amount);

    @Override
    public abstract void cancel(double amount);
}
