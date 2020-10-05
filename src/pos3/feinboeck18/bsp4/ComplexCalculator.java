package pos3.feinboeck18.bsp4;

public class ComplexCalculator extends AbstractCalculator {
<<<<<<< HEAD
    public ComplexCalculator() {
        super((Number a, Number b) -> {
            Number complexNumberToReturn = new Number();
            complexNumberToReturn.setA(a.getA() + b.getA());
            complexNumberToReturn.setB(a.getB() + b.getB());
            return complexNumberToReturn;
        },
        (Number a, Number b) -> {
            Number complexNumberToReturn = new Number();
            complexNumberToReturn.setA(a.getA() - b.getA());
            complexNumberToReturn.setB(a.getB() - b.getB());
            return complexNumberToReturn;
        },
        (Number a, Number b) -> {
            Number complexNumberToReturn = new Number();
            complexNumberToReturn.setA((a.getA() * b.getA()) - (a.getB() * b.getB()));
            complexNumberToReturn.setB((a.getB() * b.getA()) + (a.getA() * b.getB()));
            return  complexNumberToReturn;
        },
        (Number a, Number b) -> {
            Number complexNumberToReturn = new Number();
            complexNumberToReturn.setA(((a.getA() * b.getA()) + (a.getB() * b.getB())) / (((b.getA()) * b.getA()) + (b.getB() * b.getB())));
            complexNumberToReturn.setB(((a.getB() * b.getA()) - (a.getA() * b.getB())) / (((b.getA()) * b.getA()) + (b.getB() * b.getB())));
            return  complexNumberToReturn;
        });
=======
    public ComplexCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
>>>>>>> 7bc71ca5966ac43b9d6b7fc1083c1b57af5430af
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
<<<<<<< HEAD
}
=======
}
>>>>>>> 7bc71ca5966ac43b9d6b7fc1083c1b57af5430af
