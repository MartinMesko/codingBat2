package funkcionalneProgramovanie;

import java.util.ArrayList;
import java.util.List;

public class AddStar {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ja");
        list.add("Jaa");
        list.add("Peto");
        list.add("Mato");
        list.add("Jaro");
        addStar(list);
        System.out.println(list + " ");


    }

    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;


    }
}
