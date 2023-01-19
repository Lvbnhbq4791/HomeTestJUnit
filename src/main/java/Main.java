import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text;
    static Map<Character, Integer> symbolCollection = new HashMap<>();

    public static void main(String[] args) {
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore" +
                "magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea" +
                "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla" +
                "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est" +
                "laborum.";
        breakTextSymbol();
        MaxMinValue maxMinValue = new MaxMinValue(symbolCollection);
        maxMinValue.setMaxValue();// вызов метод для определения максимального количества повторений
        maxMinValue.setMinValue();// вызов метод для определения минимального количества повторений
        String separator = "-------------------------------------------------";
        System.out.println(separator + "\n" + "Cамое максимальное колличество символа в тексте");
        System.out.println(maxMinValue.maxNumberOfSymbol() + "\n" + separator);
        System.out.println(separator + "\n" + "Cамое минимальное колличество символа в тексте");
        System.out.println(maxMinValue.minNumberOfSymbol() + "\n" + separator);
    }

    //метод заполненеия колекции symbolCollection (key(символ), Value(кол-во повторений))
    public static void breakTextSymbol() {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                Character symbol = text.charAt(i);
                if (symbolCollection.containsKey(symbol)) {
                    int f = symbolCollection.get(symbol);
                    f++;
                    symbolCollection.put(symbol, f);
                } else {
                    symbolCollection.put(symbol, 1);
                }
            }
        }
    }
}
