package sb02.java;

public class EqualsTest {
    public static void main(String[] args) {
        String paymentType = "creditCard";
        boolean result1 = (paymentType == "creditCard");
        System.out.println(result1);
        boolean result2 = paymentType.equals("creditCard");
        System.out.println(result2);
    }
}
