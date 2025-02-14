package sb02.oop.pr2;

public abstract class AbstractDelivery implements Delivery {
    protected String trackingNumber;
    protected String carrier;

    public AbstractDelivery(String trackingNumber, String carrier) {
        this.trackingNumber = trackingNumber;
        this.carrier = carrier;
    }
}
