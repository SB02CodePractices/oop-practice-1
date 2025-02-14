package sb02.oop.pr2;

public class DomesticDelivery extends AbstractDelivery {

    public DomesticDelivery(String trackingNumber, String carrier) {
        super(trackingNumber, carrier);
    }

    @Override
    public void startDelivery() {
        System.out.println("국내 배송: " + trackingNumber);
    }
}
