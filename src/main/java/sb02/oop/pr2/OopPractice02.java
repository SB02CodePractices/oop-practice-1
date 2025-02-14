package sb02.oop.pr2;

public class OopPractice02 {
    public static void main(String[] args) {
        DomesticDelivery delivery = new DomesticDelivery("t001", "기사1");
        Order order = new Order("o001");
        order.setDelivery(delivery);
        order.startOrderDelivery();

        QuickDelivery quickDelivery = new QuickDelivery("t002", "기사2");
        Order order2 = new Order("o002");
        order2.setDelivery(quickDelivery);
        System.out.println("Order2:");
        order2.startOrderDelivery();
    }
}
