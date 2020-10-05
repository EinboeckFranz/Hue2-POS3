package pos3.feinboeck18.bsp4;

public class VectorCalculator extends AbstractCalculator {
    public VectorCalculator() {
        super((Number a, Number b) -> {
            Number vectorToReturn = new Number();
            vectorToReturn.setA(a.getA() + b.getA());
            vectorToReturn.setB(a.getB() + b.getB());
            return vectorToReturn;
        },
        (Number a, Number b) -> {
            Number vectorToReturn = new Number();
            vectorToReturn.setA(a.getA() - b.getA());
            vectorToReturn.setB(a.getB() - b.getB());
            return vectorToReturn;
        },
        (Number a, Number b) -> {
            Number vectorToReturn = new Number();
            vectorToReturn.setA(a.getA() * b.getB() - b.getA() * a.getB());
            return vectorToReturn;
        },
        (Number a, Number b) -> {
            Number vectorToReturn = new Number();
            vectorToReturn.setA(a.getA() / b.getA());
            vectorToReturn.setB(a.getB() / b.getB());
            return vectorToReturn;
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