package sb02.oop.pr7.func_intf;

public class AddCalculator implements MyCalculator {
    @Override
    public int operate(int x, int y) {
        return x + y;
    }
}
