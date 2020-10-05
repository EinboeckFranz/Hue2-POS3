package pos3.feinboeck18.bsp4;

public class RelationalCalculator extends AbstractCalculator {
    public RelationalCalculator() {
        super((Number a, Number b) -> {
            Number relationalNumberToReturn = new Number();
            relationalNumberToReturn.setA(a.getA() * b.getB() + b.getA() * a.getB());
            relationalNumberToReturn.setB(a.getB() * b.getB());
            return relationalNumberToReturn;
        },
        (Number a, Number b) -> {
            Number relationalNumberToReturn = new Number();
            relationalNumberToReturn.setA(a.getA() * b.getB() + -b.getA() * a.getB());
            relationalNumberToReturn.setB(a.getB() * b.getB());
            return relationalNumberToReturn;
        },
        (Number a, Number b) -> {
            Number relationalNumberToReturn = new Number();
            relationalNumberToReturn.setA(a.getA() * b.getA());
            relationalNumberToReturn.setB(a.getB() * b.getB());
            return relationalNumberToReturn;
        },
        (Number a, Number b) -> {
            Number relationalNumberToReturn = new Number();
            relationalNumberToReturn.setA(a.getA() * b.getB());
            relationalNumberToReturn.setB(a.getB() * b.getA());
            return relationalNumberToReturn;
        });
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a, b);
    }
}