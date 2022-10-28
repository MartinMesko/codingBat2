package funkcionalneProgramovanie;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Spinwords {
    public static void main(String[] args) {
        String veta = "Hey wollef sroirraw";
        System.out.println(spinWords(veta));

    }

    public static String spinWords(String sentence) {

        String[] array = sentence.split(" ");
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = array[i].length() >= 5 ? array[i] = new StringBuffer(array[i]).reverse().toString() : array[i];
        }
        String out = Arrays.toString(array);
        return out = out.substring(1, out.length() - 1).replaceAll(",", "");
    }


}

