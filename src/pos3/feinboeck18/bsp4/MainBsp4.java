package pos3.feinboeck18.bsp4;

import java.util.Scanner;

public class MainBsp4 {
    RelationalCalculator relationalCalculator;
    VectorCalculator vectorCalculator;
    ComplexCalculator complexCalculator;

    public static void main(String[] args) {
        MainBsp4 mainBsp4 = new MainBsp4();
        mainBsp4.run();
    }

    public void run() {
        int chosenMenuOption;
        Number erg = null;
        initCalculators();

        while (true) {
            chosenMenuOption = printMenu();
            Number[] numbs = getNumbers();
            int calcOption = choseCalcOption();
            switch(chosenMenuOption) {
                case 1:
                    erg = calcWithOperator(this.relationalCalculator, calcOption, numbs);
                    break;
                case 2:
                    erg = calcWithOperator(this.vectorCalculator, calcOption, numbs);
                    break;
                case 3:
                    erg = calcWithOperator(this.complexCalculator, calcOption, numbs);
                    break;
                case 4:
                    System.out.println("Shutting down ...");
                    System.exit(0);
                break;
                default:
                    System.out.println("Unknown Operation!");
            }
            if(erg == null)
                System.out.println("Unable to Calculate");
            else {
                System.out.println("" +
                        "-----------------------" +
                        "\na = " + erg.getA() +
                        "\nb = " + erg.getB() +
                        "\n-----------------------");
            }
        }
    }

    private Number calcWithOperator(AbstractCalculator calculator, int calcOption, Number[] numbs) {
        if (numbs == null)
            return null;

        switch (calcOption) {
            case 1:
                return calculator.add(numbs[0], numbs[1]);
            case 2:
                return calculator.subtract(numbs[0], numbs[1]);
            case 3:
                return calculator.multiply(numbs[0], numbs[1]);
            case 4:
                return calculator.divide(numbs[0], numbs[1]);
            default:
                return null;
        }
    }

    private Number[] getNumbers() {
        Scanner sc = new Scanner(System.in);
        Number a = new Number();
        Number b = new Number();

        try {
            System.out.println("Enter number x a>");
            double numbAX = Double.parseDouble(sc.nextLine());
            System.out.println("Enter number x b>");
            a.setA(numbAX);
            a.setB(Double.parseDouble(sc.nextLine()));
            System.out.println("Enter number y a>");
            double numbBX = Double.parseDouble(sc.nextLine());
            b.setA(numbBX);
            System.out.println("Enter number y b>");
            b.setB(Double.parseDouble(sc.nextLine()));
            return new Number[]{a, b};
        } catch (NumberFormatException nfe) {
            return null;
        }
    }

    private int choseCalcOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose operation:\n" +
                "1 - add\n" +
                "2 - subtract\n" +
                "3 - multiply\n" +
                "4 - divide\n" +
                "5 - enter numbers again");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            return -1;
        }
    }

    public int printMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose calculator:\n" +
                           "1 - Relational calculator\n" +
                           "2 - Vector calculator\n" +
                           "3 - Complex calculator\n" +
                           "4 - Exit program");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            return -1;
        }
    }

    public void initCalculators() {
        this.relationalCalculator = new RelationalCalculator();
        this.vectorCalculator = new VectorCalculator();
        this.complexCalculator = new ComplexCalculator();
    }
}