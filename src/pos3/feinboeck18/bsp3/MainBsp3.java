package pos3.feinboeck18.bsp3;

import java.util.stream.IntStream;

public class MainBsp3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        NumberTester numberTest = new NumberTester("file.txt");
        numberTest.setOddEvenTester(number -> number % 2 == 0);
        numberTest.setPrimeTester(number -> number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number)).
                noneMatch(n -> (number % n == 0)));
        numberTest.setPalindromeTester(number -> {
            String stringValue = String.valueOf(number);
            return stringValue.equals(new StringBuilder(stringValue).reverse().toString());
        });
        numberTest.testFile();
    }
}