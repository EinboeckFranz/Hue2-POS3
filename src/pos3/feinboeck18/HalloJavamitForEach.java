package pos3.feinboeck18;

import java.util.Arrays;
import java.util.List;

public class HalloJavamitForEach {
    private List<String> liste;

    public HalloJavamitForEach(String[] arrayListe) {
        this.liste = Arrays.asList(arrayListe.clone());
    }

    public void run() {
        /*for (String s : liste) System.out.println(s);*/

        /*liste.forEach((String s) -> System.out.println(s));*/

        liste.forEach(System.out::println);
    }

    public static void main(String[] args) {
        HalloJavamitForEach main = new HalloJavamitForEach(new String[]{"String1", "String2", "String3", "String4"});
        main.run();
    }
}