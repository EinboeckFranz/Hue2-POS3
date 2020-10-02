package pos3.feinboeck18.bsp3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester {
    private final File file;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    public NumberTester(String path) {
        this.file = new File(path);
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        try {
            Scanner sc = new Scanner(file);
            int howMuchOperations = Integer.parseInt(sc.nextLine().trim());

            if(howMuchOperations < 1)
                return;

            for (int i = 1; i <= howMuchOperations; i++) {
                if(sc.hasNextLine()) {
                    String[] arr = sc.nextLine().split(" ");
                    if(arr.length > 2) {
                        for (int j = 1; j < arr.length; j++)
                            operationalSwitch(Integer.parseInt(arr[0].trim()), Integer.parseInt(arr[j].trim()));
                    } else if(arr.length == 2)
                        operationalSwitch(Integer.parseInt(arr[0].trim()), Integer.parseInt(arr[1].trim()));
                } else
                    break;
            }
        } catch (FileNotFoundException e) {
            System.out.println("This path could not be found");
        }
    }

    private void operationalSwitch(int operationNumber, int numberToTest) {
        switch (operationNumber) {
            case 1:
                System.out.println(oddTester.testNumber(numberToTest) ? "EVEN" : "ODD");
            break;
            case 2:
                System.out.println(primeTester.testNumber(numberToTest) ? "PRIME" : "NO PRIME");
            break;
            case 3:
                System.out.println(palindromeTester.testNumber(numberToTest) ? "PALINDROME" : "NO PALINDROME");
            break;
            default:
                System.out.println("*** Unknown Operation! ***");
            break;
        }
    }
}

interface NumberTest {
    boolean testNumber(int number);
}