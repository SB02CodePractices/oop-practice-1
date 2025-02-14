package sb02.oop.pr2;

public class QuickDelivery extends AbstractDelivery {

    public QuickDelivery(String trackingNumber, String carrier) {
        super(trackingNumber, carrier);
    }

    @Override
    public void startDelivery() {
        System.out.println("해외 배송: " + trackingNumber);
    }
}
